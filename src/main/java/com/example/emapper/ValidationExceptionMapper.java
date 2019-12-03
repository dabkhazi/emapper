package  com.example.emapper;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper <ConstraintViolationException>{

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		StringBuffer errors = new StringBuffer();
		exception.getConstraintViolations().forEach((v)->errors.append(v.getMessage()));
		return Response.status(Status.BAD_REQUEST)
        .entity(errors.toString()).build();		
	}

}
