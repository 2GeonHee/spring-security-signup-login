package com.sparta.user.controller;

import com.sparta.user.entity.User;
import com.sparta.user.security.UserDetailsImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {
//jwt 검증
    @GetMapping("/products")
    public String getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {
/*        System.out.println("ProductController.getProducts : 인증 완료");
        User user = (User) req.getAttribute("user");
        System.out.println("user.getUsername() = " + user.getUsername());
         Authentication 의 Princlple(유저디테일스가들어감),*/
        User user = userDetails.getUser();
        System.out.println("user.getUsername() = " + user.getUsername());
        return "redirect:/";
    }
}