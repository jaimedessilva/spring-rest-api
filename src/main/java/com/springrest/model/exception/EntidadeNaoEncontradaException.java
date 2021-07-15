package com.springrest.model.exception;

/**
 * springrest
 * @author Desenvolvedor
 * 14 de jul de 2021
 *  https://github.com/jaimedessilva/
 */
public class EntidadeNaoEncontradaException extends NegocioException {

	public EntidadeNaoEncontradaException(String message) {
		super(message);	
	}
	private static final long serialVersionUID = 1L;
}
