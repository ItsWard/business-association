package run.ward.businessassociation.domain.company;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private String category;

    @CreatedBy
    private LocalDate regDate;

    @LastModifiedBy
    private LocalDate modDate;

    @Builder
    public Company(String name, String region, String category) {
        this.name = name;
        this.region = region;
        this.category = category;
    }
}
