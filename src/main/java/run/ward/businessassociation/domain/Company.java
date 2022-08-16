package run.ward.businessassociation.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
public class Company {

    @Id
    private Long id;
    private String name;
    private String region;
    private String category;

    @CreatedBy
    private LocalDate regDate;

    @LastModifiedBy
    private LocalDate modDate;


}
