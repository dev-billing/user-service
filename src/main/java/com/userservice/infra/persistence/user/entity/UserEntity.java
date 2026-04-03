package com.userservice.infra.persistence.user.entity;

import com.userservice.domain.model.User;
import com.userservice.infra.persistence.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "nick_name", nullable = false, length = 50)
    private String nickName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Builder(access = AccessLevel.PRIVATE)
    private UserEntity(String phone, String password, String nickName, LocalDate birthDate) {
        this.phone = phone;
        this.password = password;
        this.nickName = nickName;
        this.birthDate = birthDate;
    }

    public static UserEntity from(User user) {
        return UserEntity.builder()
                .phone(user.getPhone())
                .password(user.getPassword())
                .nickName(user.getNickName())
                .birthDate(user.getBirthDate())
                .build();
    }
}