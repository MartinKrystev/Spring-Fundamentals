package com.example.mobilele.services.init;

import org.springframework.stereotype.Service;

@Service
public class DbInitImpl implements DbInit{
    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return true;
    }
}
