package  com.example.emapper;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = TokenValidator.class)
@Documented
@Retention(RUNTIME)
@Target({PARAMETER})
public @interface ValidToken {
	
  String message() default "{token.error.message.default}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
