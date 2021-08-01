package nathan.darcy.sb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import nathan.darcy.sb.domain.ApplicationEntity;
import nathan.darcy.sb.domain.WebsiteUserEntity;

@Repository
public interface WebsiteUserRepository extends PagingAndSortingRepository<WebsiteUserEntity, Long> {
    boolean existsByUserNameAndApplication(String userName, ApplicationEntity application);
}
