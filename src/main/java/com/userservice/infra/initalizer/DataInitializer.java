package com.userservice.infra.initalizer;

import com.userservice.domain.model.User;
import com.userservice.infra.persistence.user.entity.UserEntity;
import com.userservice.infra.persistence.user.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@Profile({"local", "test"})
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserJpaRepository userJpaRepository;

    @Override
    public void run(String... args) throws Exception {

        if (userJpaRepository.count() > 0) {
            log.info("Data already initialized. Skipping...");
            return;
        }

        log.info("User data initialization...");
        initializeUsers();
    }

    private void initializeUsers() {
        List<UserEntity> users = new ArrayList<>();

        users.add(UserEntity.from(User.create("010-1234-5678", "password123", "김아무개", LocalDate.of(1990, 5, 15))));
        users.add(UserEntity.from(User.create("010-2345-6789", "password456", "이아무개", LocalDate.of(1995, 8, 20))));
        users.add(UserEntity.from(User.create("010-3456-7890", "password789", "박아무개", LocalDate.of(1988, 12, 3))));
        users.add(UserEntity.from(User.create("010-4567-8901", "password111", "최민수", LocalDate.of(1992, 3, 10))));
        users.add(UserEntity.from(User.create("010-5678-9012", "password222", "정수영", LocalDate.of(1994, 7, 22))));
        users.add(UserEntity.from(User.create("010-6789-0123", "password333", "강지훈", LocalDate.of(1991, 11, 5))));
        users.add(UserEntity.from(User.create("010-7890-1234", "password444", "윤서연", LocalDate.of(1996, 2, 14))));
        users.add(UserEntity.from(User.create("010-8901-2345", "password555", "임태희", LocalDate.of(1989, 9, 28))));
        users.add(UserEntity.from(User.create("010-9012-3456", "password666", "한소희", LocalDate.of(1993, 6, 18))));
        users.add(UserEntity.from(User.create("010-0123-4567", "password777", "조민호", LocalDate.of(1997, 1, 30))));
        users.add(UserEntity.from(User.create("010-1111-2222", "password888", "서예진", LocalDate.of(1990, 12, 25))));
        users.add(UserEntity.from(User.create("010-2222-3333", "password999", "권도현", LocalDate.of(1995, 4, 9))));
        users.add(UserEntity.from(User.create("010-3333-4444", "passwordaaa", "송하늘", LocalDate.of(1987, 8, 16))));
        users.add(UserEntity.from(User.create("010-4444-5555", "passwordbbb", "안지우", LocalDate.of(1992, 10, 21))));
        users.add(UserEntity.from(User.create("010-5555-6666", "passwordccc", "배수진", LocalDate.of(1994, 5, 7))));
        users.add(UserEntity.from(User.create("010-6666-7777", "passwordddd", "홍준표", LocalDate.of(1991, 3, 12))));
        users.add(UserEntity.from(User.create("010-7777-8888", "passwordeee", "나윤아", LocalDate.of(1996, 9, 3))));
        users.add(UserEntity.from(User.create("010-8888-9999", "passwordfff", "오성민", LocalDate.of(1988, 7, 19))));
        users.add(UserEntity.from(User.create("010-9999-0000", "passwordggg", "하은비", LocalDate.of(1993, 11, 26))));
        users.add(UserEntity.from(User.create("010-1212-3434", "passwordhhh", "유재석", LocalDate.of(1997, 2, 8))));
        users.add(UserEntity.from(User.create("010-5656-7878", "passwordiii", "방민정", LocalDate.of(1990, 6, 14))));
        users.add(UserEntity.from(User.create("010-9090-1212", "passwordjjj", "신동엽", LocalDate.of(1995, 1, 20))));
        users.add(UserEntity.from(User.create("010-3434-5656", "passwordkkk", "김연아", LocalDate.of(1989, 10, 11))));
        users.add(UserEntity.from(User.create("010-7878-9090", "passwordlll", "이상민", LocalDate.of(1992, 4, 27))));
        users.add(UserEntity.from(User.create("010-2121-4343", "passwordmmm", "박나래", LocalDate.of(1994, 12, 5))));
        users.add(UserEntity.from(User.create("010-6565-8787", "passwordnnn", "전현무", LocalDate.of(1991, 8, 23))));
        users.add(UserEntity.from(User.create("010-8989-0101", "passwordooo", "장도연", LocalDate.of(1996, 3, 17))));
        users.add(UserEntity.from(User.create("010-4545-6767", "passwordppp", "김구라", LocalDate.of(1987, 11, 29))));
        users.add(UserEntity.from(User.create("010-0909-2323", "passwordqqq", "문세윤", LocalDate.of(1993, 7, 2))));
        users.add(UserEntity.from(User.create("010-3232-5454", "passwordrrr", "양세형", LocalDate.of(1995, 5, 31))));

        userJpaRepository.saveAll(users);
        log.info("Initialized {} users", users.size());
    }
}
