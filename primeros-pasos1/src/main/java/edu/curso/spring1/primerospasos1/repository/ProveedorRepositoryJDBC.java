package edu.curso.spring1.primerospasos1.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import edu.curso.spring1.primerospasos1.bo.Proveedor;

@Repository
public class ProveedorRepositoryJDBC implements ProveedorRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) throws SQLException {
		// jdbcTemplate = new JdbcTemplate(dataSource);
//	    Connection connection = dataSource.getConnection();
//	    PreparedStatement prepStat = connection.prepareStatement("INSERT INTO XXXX VALUES (?,?)");

	}

	@Override
	public void altaProveedor(Proveedor proveedor) {
		String sql = "INSERT INTO PROVEEDORES (nombre, direccion) VALUES(?, ?)";
		jdbcTemplate.update(sql, proveedor.getNombre(), proveedor.getDireccion());

	}

	@Override
	public void actualizarProveedor(Proveedor proveedor) {
		String sql = "UPDATE PROVEEDORES SET nombre= ?, direccion = ? WHERE id = ?";
		jdbcTemplate.update(sql, proveedor.getNombre(), proveedor.getDireccion(), proveedor.getId());
	}

	@Override
	public void borrarProveedor(Long id) {
		String sql = "DELETE FROM PROVEEDORES WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Proveedor buscarProveedorPorId(Long id) {
		String sql = "SELECT id, nombre, direccion FROM PROVEEDORES WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Proveedor>() {
			@Override
			public Proveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Proveedor(rs.getLong("id"), rs.getString("nombre"), rs.getString("direccion"));
			}

		}, id);

	}

	@Override
	public List<Proveedor> buscarProveedores() {
		String sql = "SELECT id, nombre, direccion FROM PROVEEDORES";  
        return jdbcTemplate.query(sql, new RowMapper<Proveedor>() {

			@Override
			public Proveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
			    return new Proveedor(rs.getLong("id"), rs.getString("nombre"), rs.getString("direccion"));
			}
        	
        });
	}

}
