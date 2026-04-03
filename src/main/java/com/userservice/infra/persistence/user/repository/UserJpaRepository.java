package com.userservice.infra.persistence.user.repository;

import com.userservice.infra.persistence.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}