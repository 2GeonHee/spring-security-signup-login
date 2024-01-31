package com.sparta.user.controller;

import com.sparta.user.dto.SignupRequestDto;
import com.sparta.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService service;

    @GetMapping("/user/login-page")
    public String loginPage() {
        return "login";
    }   //로그인페이지


    @GetMapping("/user/signup")
    public String signupPage() {
        return "signup";
    } // 회원가입페이지

    @PostMapping("/user/signup")
    public String signup(@RequestBody SignupRequestDto requestdto) {
        service.signup(requestdto);
        return "redirect:/api/user-login";
    } //회원가입

}
