package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Almacenes;

public interface AlmacenesDao {
	Almacenes create(Almacenes a);
	Almacenes update(Almacenes a);
	void delete(Long id);
	Optional<Almacenes> read(Long id);
	List<Almacenes> readAll();
}
