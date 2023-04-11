package RetoInicial.HolaMundo.Exception;

public class IdiomaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 921874648651377097L;


	public IdiomaNotFoundException(String message) {
        super(message);
    }
}
