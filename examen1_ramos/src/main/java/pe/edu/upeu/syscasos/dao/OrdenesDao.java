package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Ordenes;

public interface OrdenesDao {
	Ordenes create(Ordenes a);
	Ordenes update(Ordenes a);
	void delete(Long id);
	Optional<Ordenes> read(Long id);
	List<Ordenes> readAll();
}
