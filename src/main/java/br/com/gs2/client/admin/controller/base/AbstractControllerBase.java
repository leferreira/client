package br.com.gs2.client.admin.controller.base;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gs2.client.admin.service.base.AbstractServiceBase;

public abstract class AbstractControllerBase<T extends AbstractServiceBase<?, ?>> {

	
	@Autowired
	private T service;

	
	public T getService() {
		return service;
	}

	public void setService(T service) {
		this.service = service;
	}
	
	
}
