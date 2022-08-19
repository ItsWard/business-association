package run.ward.businessassociation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import run.ward.businessassociation.domain.member.Member;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter

public class MemberSignUpDto {

    private String nickname;
    private String password;
    private String name;
    private String phone;
    private String email;


    public Member toEntity() {

        return Member.builder()
                .nickname(this.nickname)
                .password(this.password)
                .email(this.email)
                .name(this.name)
                .phone(this.phone)
                .build();
    }

}
