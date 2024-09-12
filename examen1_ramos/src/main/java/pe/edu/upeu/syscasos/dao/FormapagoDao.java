package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Formapago;

public interface FormapagoDao {
	Formapago create(Formapago a);
	Formapago update(Formapago a);
	void delete(Long id);
	Optional<Formapago> read(Long id);
	List<Formapago> readAll();
}
