package br.com.gs3.client.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gs3.client.admin.controller.base.AbstractControllerBase;
import br.com.gs3.client.admin.entity.Cliente;
import br.com.gs3.client.admin.service.ClienteService;

/**
 * Classe ClienteController
 * 
 * @author Leandro
 *
 */
@RestController
@RequestMapping({ "/clientes" })
public class ClienteController extends AbstractControllerBase<ClienteService> {

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		return getService().getRepository().findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Cliente create(@RequestBody Cliente contact) {
		return getService().criar(contact);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
		return getService().update(id, cliente);
	}
	
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity <?> delete(@PathVariable Integer id) {
	  return getService().delete(id);
	}
	
	@GetMapping()
	public ResponseEntity<List<Cliente>> findAll(
			@RequestParam(defaultValue = "0") Integer paginaInicial, 
            @RequestParam(defaultValue = "10") Integer paginaTamanho,
            @RequestParam(defaultValue = "id") String ordenadoPor) {
		List<Cliente> list = getService().getAll(paginaInicial, paginaTamanho, ordenadoPor);
		return new ResponseEntity<List<Cliente>>(list, HttpStatus.OK);  
	}

}
