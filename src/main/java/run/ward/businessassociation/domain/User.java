package run.ward.businessassociation.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
public class User {
    @Id
    private Long id;
    private String nickname;
    private String name;
    private String password;
    private String phone;
    private String email;

    @CreatedBy
    private LocalDate regDate;
    @LastModifiedBy
    private LocalDate modDate;

    private String role;

    @Builder
    public User(Long id, String nickname, String name, String password, String phone, String email) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
}
