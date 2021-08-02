package nathan.darcy.sb.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ApplicationValidator.class)
@Target( {ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationExists {
    public String message() default "The given application has not been registered.";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
