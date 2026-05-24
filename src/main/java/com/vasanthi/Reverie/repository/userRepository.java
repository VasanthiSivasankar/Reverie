package com.vasanthi.Reverie.repository;
import com.vasanthi.Reverie.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface userRepository extends JpaRepository<user,UUID> {
}
