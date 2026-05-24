package com.vasanthi.Reverie.controller;
import com.vasanthi.Reverie.model.user;
import com.vasanthi.Reverie.dto.RegisterRequest;
import com.vasanthi.Reverie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    @PostMapping("/register")
    public user register(@RequestBody RegisterRequest request){
        return userService.registerUser(request);
    }
}
