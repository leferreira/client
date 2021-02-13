package br.com.gs3.client.admin.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;

@NoRepositoryBean
public abstract interface AbstractRepositoryBase<T extends AbstractEntityBase<T>, ID> extends JpaRepository<T, ID> {

}
