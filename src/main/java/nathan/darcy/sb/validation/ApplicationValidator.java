package nathan.darcy.sb.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import nathan.darcy.sb.service.ApplicationProvider;

public class ApplicationValidator implements ConstraintValidator<ApplicationExists, String> {

    @Autowired
    private ApplicationProvider applicationProvider;

    @Override
    public void initialize(ApplicationExists ae) {

    }

    @Override
    public boolean isValid(String appName, ConstraintValidatorContext context) {
        return applicationProvider.existsByApplicationName(appName);
    }


}
