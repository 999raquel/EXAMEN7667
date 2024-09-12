package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Proveedores;

public interface ProveedoresService {
	Proveedores create(Proveedores a);
	Proveedores update(Proveedores a);
	void delete(Long id);
	Optional<Proveedores> read(Long id);
	List<Proveedores> readAll();
}
