package com.vasanthi.Reverie.service;
import com.vasanthi.Reverie.dto.RegisterRequest;
import com.vasanthi.Reverie.model.user;
import com.vasanthi.Reverie.repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
@Service
@RequiredArgsConstructor
public class UserService {
    private final userRepository userRepo;
    public user registerUser(RegisterRequest request){
        user us=user.builder().username(request.getUsername())
                .email(request.getEmail())
                .password(request.getPassword())
                .createdAt(LocalDateTime.now()).build();
        return userRepo.save(us);
    }
}
