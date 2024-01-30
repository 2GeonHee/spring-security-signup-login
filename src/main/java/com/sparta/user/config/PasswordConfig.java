package com.sparta.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
    @Bean
    //빈으로 등록하고자하는 객체의 메서드 위에 @Bean
    public PasswordEncoder passwordEncoder() { //passwordEncoder 등록
        return new BCryptPasswordEncoder();
        //BCrypt : 비밀번호를 암호화해주는 hash 함수 - 를 사용해 password 를 인코딩
    }
}