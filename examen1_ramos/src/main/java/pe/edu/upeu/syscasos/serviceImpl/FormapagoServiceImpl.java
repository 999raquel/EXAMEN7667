package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upeu.syscasos.entity.Formapago;
import pe.edu.upeu.syscasos.repository.FormapagoRepository;
import pe.edu.upeu.syscasos.service.FormapagoService;

@Service

public class FormapagoServiceImpl implements FormapagoService{
	@Autowired
	private FormapagoRepository formapagoRepository;
	
	@Override
	public Formapago create(Formapago a) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(a);
	}

	@Override
	public Formapago update(Formapago a) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		formapagoRepository.deleteById(id);
	}

	@Override
	public Optional<Formapago> read(Long id) {
		// TODO Auto-generated method stub
		return formapagoRepository.findById(id);
	}

	@Override
	public List<Formapago> readAll() {
		// TODO Auto-generated method stub
		return formapagoRepository.findAll();
	}


}
