package com.example.mobilele.services.user;

import com.example.mobilele.repositories.UserRepository;
import com.example.mobilele.services.init.DbInit;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DbInit {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.userRepository.count() > 0;
    }
}
