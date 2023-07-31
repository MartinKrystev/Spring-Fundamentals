package com.example.mobilele.services.brand;

import com.example.mobilele.repositories.BrandRepository;
import com.example.mobilele.services.init.DbInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DbInit {

    private final BrandRepository brandRepository;


    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.brandRepository.count() > 0;
    }

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
}
