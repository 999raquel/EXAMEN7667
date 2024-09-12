package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Proveedores;

public interface ProveedoresDao {
	Proveedores create(Proveedores a);
	Proveedores update(Proveedores a);
	void delete(Long id);
	Optional<Proveedores> read(Long id);
	List<Proveedores> readAll();
}
