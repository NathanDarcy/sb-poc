package nathan.darcy.sb.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nathan.darcy.sb.domain.ApplicationEntity;
import nathan.darcy.sb.repository.ApplicationRepository;
import nathan.darcy.sb.repository.WebsiteUserRepository;

@Service
public class WebsiteUserProvider {

    @Autowired
    private WebsiteUserRepository websiteUserRepository;

    @Autowired ApplicationRepository applicationRepository;

    @Transactional
    public boolean userExists(String userName, String applicationName) {
        ApplicationEntity app = applicationRepository.findByApplicationName(applicationName);
        return websiteUserRepository.existsByUserNameAndApplication(userName.toLowerCase(), app);
    }

}
