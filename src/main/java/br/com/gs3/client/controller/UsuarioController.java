package br.com.gs3.client.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gs3.client.admin.controller.base.AbstractControllerBase;
import br.com.gs3.client.admin.entity.Usuario;
import br.com.gs3.client.admin.service.UsuarioService;
import br.com.gs3.client.admin.vo.UsuarioVO;

/**
 * Classe UsuarioController
 * @author Leandro
 *
 */
@RestController
@CrossOrigin
public class UsuarioController extends AbstractControllerBase<UsuarioService> {
	
	@PostMapping("/login")
	public @ResponseBody Usuario login(@RequestBody UsuarioVO usuario) { 
		return getService().login(usuario);
	}
	
	
	@GetMapping("/criar-usuario-teste") 
	public ResponseEntity<String> criarUsuarioTeste(){
		getService().criarUsuarioTeste(); 
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
