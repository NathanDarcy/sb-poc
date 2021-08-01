package nathan.darcy.sb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import nathan.darcy.sb.domain.ApplicationEntity;

public interface ApplicationRepository extends PagingAndSortingRepository<ApplicationEntity, Long>{
    ApplicationEntity findByApplicationName(String applicationName);
    boolean existsByApplicationName(String applicationName);
}
