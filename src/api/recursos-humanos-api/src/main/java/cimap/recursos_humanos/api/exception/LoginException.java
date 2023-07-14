package cimap.recursos_humanos.api.exception;

public class LoginException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1365286246318970536L;

	public LoginException(String message) {
		super(message);
	}	
	
	public LoginException(Throwable arg0) {
		super(arg0);		
	}	

}
