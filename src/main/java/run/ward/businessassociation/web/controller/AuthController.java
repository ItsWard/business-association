package run.ward.businessassociation.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import run.ward.businessassociation.domain.member.Member;
import run.ward.businessassociation.domain.member.MemberRepository;
import run.ward.businessassociation.dto.MemberSignUpDto;


import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class AuthController {

    private final MemberRepository memberRepository;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody @Valid MemberSignUpDto memberSignUpDto){

        Member member = memberSignUpDto.toEntity();
        memberRepository.save(member);
        return null;

    }
}
