package com.vasanthi.Reverie.repository;
import com.vasanthi.Reverie.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.Optional;

public interface userRepository extends JpaRepository<user,UUID> {
    Optional<user> findByEmail(String email);

    Optional<user> findByUsername(String username);

}
