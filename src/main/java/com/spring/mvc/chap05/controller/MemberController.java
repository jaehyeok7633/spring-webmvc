package com.spring.mvc.chap05.controller;

import com.spring.mvc.chap05.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 회원 가입 양식 화면 요청
    // 응답하고자 하는 화면의 경로가 url과 동일하다면 void로 처리할 수 있습니다. (선택사항)
    @GetMapping("/sign-up")
    public void signUp() {
        System.out.println("/members/sign-up: GET");
    }
}
