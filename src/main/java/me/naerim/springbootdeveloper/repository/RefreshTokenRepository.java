package me.naerim.springbootdeveloper.repository;

import me.naerim.springbootdeveloper.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserID(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
