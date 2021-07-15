package com.springrest.model.exception;

/**
 * springrest
 * @author Desenvolvedor
 * 14 de jul de 2021
 *  https://github.com/jaimedessilva/
 */
public class NegocioException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Construct */
	public NegocioException(String message) {
		super(message);
		
	}

}
