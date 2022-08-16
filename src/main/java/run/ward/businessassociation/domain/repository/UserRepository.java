package run.ward.businessassociation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import run.ward.businessassociation.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
