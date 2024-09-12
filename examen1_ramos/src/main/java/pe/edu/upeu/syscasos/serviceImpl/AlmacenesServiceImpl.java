package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Almacenes;
import pe.edu.upeu.syscasos.repository.AlmacenesRepository;

import pe.edu.upeu.syscasos.service.AlmacenesService;

@Service

public class AlmacenesServiceImpl implements AlmacenesService{
	
	@Autowired
	private AlmacenesRepository almacenesRepository;
	
	@Override
	public Almacenes create(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesRepository.save(a);
	}

	@Override
	public Almacenes update(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenesRepository.deleteById(id);
	}

	@Override
	public Optional<Almacenes> read(Long id) {
		// TODO Auto-generated method stub
		return almacenesRepository.findById(id);
	}

	@Override
	public List<Almacenes> readAll() {
		// TODO Auto-generated method stub
		return almacenesRepository.findAll();
	}

}
