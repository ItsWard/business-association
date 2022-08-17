package run.ward.businessassociation.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String name;
    private String password;
    private String phone;
    private String email;

    @CreatedBy
    private LocalDate regDate ;
    @LastModifiedBy
    private LocalDate modDate ;

    private String role;

    @Builder
    public User(String nickname, String name, String password, String phone, String email) {
        this.nickname = nickname;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

}
