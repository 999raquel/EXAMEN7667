package pe.edu.upeu.syscasos.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.syscasos.entity.Tipoorden;
import pe.edu.upeu.syscasos.service.TipoordenService;

@RestController
@RequestMapping("/api/tipoorden")

public class TipoordenControllers {
	@Autowired
	private TipoordenService tipoordenService;
	
	@GetMapping
	public ResponseEntity<List<Tipoorden>> readAll(){
		try {
			List<Tipoorden> Tipoorden =tipoordenService.readAll();
			if(Tipoorden.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Tipoorden, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Tipoorden> crear(@Valid @RequestBody Tipoorden a){
		try {
			Tipoorden c = tipoordenService.create(a);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tipoorden> getAutorId(@PathVariable("id") Long id){
		try {
			Tipoorden c = tipoordenService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipoorden> delAutor(@PathVariable("id") Long id){
		try {
			tipoordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAutor(@PathVariable("id") Long id, @Valid @RequestBody Tipoorden a){

			Optional<Tipoorden> c = tipoordenService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(tipoordenService.update(a), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
	

}
