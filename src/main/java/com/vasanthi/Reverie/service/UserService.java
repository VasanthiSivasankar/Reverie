package com.vasanthi.Reverie.service;
import com.vasanthi.Reverie.dto.RegisterRequest;
import com.vasanthi.Reverie.dto.LoginRequest;
import com.vasanthi.Reverie.model.user;
import com.vasanthi.Reverie.repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
@RequiredArgsConstructor
public class UserService {
    private final userRepository userRepo;
    private final PasswordEncoder passwordEncoder;
    public user registerUser(RegisterRequest request){
        user us=user.builder().username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .createdAt(LocalDateTime.now()).build();
        return userRepo.save(us);
    }
    public String loginUser(LoginRequest request){
        Optional<user> optionalUser=userRepo.findByEmail(request.getEmail());
        if(optionalUser.isEmpty()) return "No user found";
        user us=optionalUser.get();
        boolean isPasswordCorrect=passwordEncoder.matches(request.getPassword(), us.getPassword());
        if(!isPasswordCorrect) return "Invalid password";
        return "login successful";
    }
}
