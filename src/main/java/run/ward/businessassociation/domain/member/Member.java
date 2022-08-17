package run.ward.businessassociation.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;



@Getter
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder
    public Member(String nickname, String password, String name, String phone, String email) {
        this.nickname = nickname;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Column(nullable = false, updatable = false, unique = true)
    private String nickname;

    private String password;
    private String name;

    private String phone;

    @Email
    private String email;

    @CreatedDate
    private Date regDate;
    @LastModifiedDate
    private Date modDate;

    private String role = "ROLE_USER";

}
