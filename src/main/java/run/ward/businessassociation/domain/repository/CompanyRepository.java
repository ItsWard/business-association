package run.ward.businessassociation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import run.ward.businessassociation.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
