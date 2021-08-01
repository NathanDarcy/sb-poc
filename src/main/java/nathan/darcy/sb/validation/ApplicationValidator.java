package nathan.darcy.sb.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import nathan.darcy.sb.repository.ApplicationRepository;

public class ApplicationValidator implements ConstraintValidator<ApplicationExists, String> {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public void initialize(ApplicationExists ae) {

    }

    @Override
    public boolean isValid(String appName, ConstraintValidatorContext context) {
        return applicationRepository.existsByApplicationName(appName);
    }


}
