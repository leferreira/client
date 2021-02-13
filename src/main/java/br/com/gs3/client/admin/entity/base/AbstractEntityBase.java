package br.com.gs3.client.admin.entity.base;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 
 * @author
 *
 * @param <T>
 */
@MappedSuperclass
public abstract class AbstractEntityBase<T> implements Serializable, Comparable<T> {
	private static final long serialVersionUID = 1L;

}
