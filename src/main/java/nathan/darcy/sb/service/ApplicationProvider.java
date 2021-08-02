package nathan.darcy.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nathan.darcy.sb.repository.ApplicationRepository;

@Service
public class ApplicationProvider {
    @Autowired
    private ApplicationRepository applicationRepository;

    public boolean existsByApplicationName(String applicatioName) {
        return applicationRepository.existsByApplicationName(applicatioName);
    }

}
