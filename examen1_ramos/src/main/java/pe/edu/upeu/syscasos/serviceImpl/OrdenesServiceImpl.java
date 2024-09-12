package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Ordenes;
import pe.edu.upeu.syscasos.repository.OrdenesRepository;
import pe.edu.upeu.syscasos.service.OrdenesService;

@Service

public class OrdenesServiceImpl implements OrdenesService{
	@Autowired
	private OrdenesRepository ordenesRepository;
	
	@Override
	public Ordenes create(Ordenes a) {
		// TODO Auto-generated method stub
		return ordenesRepository.save(a);
	}

	@Override
	public Ordenes update(Ordenes a) {
		// TODO Auto-generated method stub
		return ordenesRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenesRepository.deleteById(id);
	}

	@Override
	public Optional<Ordenes> read(Long id) {
		// TODO Auto-generated method stub
		return ordenesRepository.findById(id);
	}

	@Override
	public List<Ordenes> readAll() {
		// TODO Auto-generated method stub
		return ordenesRepository.findAll();
	}

}
