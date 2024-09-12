package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Proveedores;

import pe.edu.upeu.syscasos.repository.ProveedoresRepository;
import pe.edu.upeu.syscasos.service.ProveedoresService;

@Service
public class ProveedoresServiceImpl  implements ProveedoresService{
	
	@Autowired
	private ProveedoresRepository proveedoresRepository;
	
	@Override
	public Proveedores create(Proveedores a) {
		// TODO Auto-generated method stub
		return proveedoresRepository.save(a);
	}

	@Override
	public Proveedores update(Proveedores a) {
		// TODO Auto-generated method stub
		return proveedoresRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedoresRepository.deleteById(id);
	}

	@Override
	public Optional<Proveedores> read(Long id) {
		// TODO Auto-generated method stub
		return proveedoresRepository.findById(id);
	}

	@Override
	public List<Proveedores> readAll() {
		// TODO Auto-generated method stub
		return proveedoresRepository.findAll();
	}

}
