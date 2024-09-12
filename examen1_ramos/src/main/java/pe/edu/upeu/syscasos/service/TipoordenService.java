package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Tipoorden;

public interface TipoordenService {
	Tipoorden create(Tipoorden a);
	Tipoorden update(Tipoorden a);
	void delete(Long id);
	Optional<Tipoorden> read(Long id);
	List<Tipoorden> readAll();

}
