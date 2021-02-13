package br.com.gs2.client.admin.service.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.gs2.client.admin.entity.base.AbstractEntityBase;
import br.com.gs2.client.admin.repository.base.AbstractRepositoryBase;

public abstract class AbstractServiceBase<D extends AbstractEntityBase<D>, T extends AbstractRepositoryBase<D, Integer>> {

	private static final Logger logger = LoggerFactory.getLogger(AbstractServiceBase.class);


	private D entity;

	@Autowired
	private T repository;

	public D getEntity() {
		return entity;
	}

	public void setEntity(D entity) {
		this.entity = entity;
	}

	public T getRepository() {
		return repository;
	}

	public void setRepository(T repository) {
		this.repository = repository;
	}


	public Logger logger() {
		return AbstractServiceBase.logger;
	}

	public ResponseEntity<String> responseSucesso(String mensagem) {
		logger().info(mensagem);
		return new ResponseEntity<String>(mensagem, HttpStatus.OK);
	}

	public ResponseEntity<String> responseErro(String mensagem, HttpStatus status) {
		logger().error(mensagem);
		return new ResponseEntity<String>(mensagem, status);
	}

	abstract public D criar(D entity) throws Exception;
}
