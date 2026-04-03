package com.userservice.domain.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User {

    private final Long userId;

    private final String phone;

    private final String password;

    private final String nickName;

    private final LocalDate birthDate;

    @Builder(access = AccessLevel.PRIVATE)
    private User(Long userId, String phone, String password, String nickName, LocalDate birthDate) {
        this.userId = userId;
        this.phone = phone;
        this.password = password;
        this.nickName = nickName;
        this.birthDate = birthDate;
    }

    public static User create(String phone, String password, String nickName, LocalDate birthDate) {
        return User.builder()
                .phone(phone)
                .password(password)
                .nickName(nickName)
                .birthDate(birthDate)
                .build();
    }
}
