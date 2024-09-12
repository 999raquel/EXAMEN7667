package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Tipoorden;
import pe.edu.upeu.syscasos.repository.TipoordenRepository;
import pe.edu.upeu.syscasos.service.TipoordenService;

@Service

public class TipoordenServiceImpl implements TipoordenService{
	@Autowired
	private TipoordenRepository tipoordenRepository;
	
	@Override
	public Tipoorden create(Tipoorden a) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(a);
	}

	@Override
	public Tipoorden update(Tipoorden a) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoordenRepository.deleteById(id);
	}

	@Override
	public Optional<Tipoorden> read(Long id) {
		// TODO Auto-generated method stub
		return tipoordenRepository.findById(id);
	}

	@Override
	public List<Tipoorden> readAll() {
		// TODO Auto-generated method stub
		return tipoordenRepository.findAll();
	}

}
