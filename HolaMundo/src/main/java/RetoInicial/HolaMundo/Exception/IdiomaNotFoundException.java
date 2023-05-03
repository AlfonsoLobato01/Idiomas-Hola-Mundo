package RetoInicial.HolaMundo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdiomaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 921874648651377097L;


	public IdiomaNotFoundException(String message) {
        super(message);
    }
}
