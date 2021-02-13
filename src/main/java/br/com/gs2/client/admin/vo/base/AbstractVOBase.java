package br.com.gs2.client.admin.vo.base;

import br.com.gs2.client.admin.entity.base.AbstractEntityBase;

public abstract class AbstractVOBase<T extends AbstractEntityBase<T>> {

	public abstract T converter(); 
}
