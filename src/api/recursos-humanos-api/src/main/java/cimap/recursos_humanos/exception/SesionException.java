package cimap.recursos_humanos.exception;

import org.springframework.security.core.AuthenticationException;

public class SesionException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5099904416458452197L;
	
	public SesionException(String mensaje) {
		super(mensaje);		
	}

}
