package com.example.mobilele.services.model;

import com.example.mobilele.repositories.ModelRepository;
import com.example.mobilele.services.init.DbInit;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DbInit {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.modelRepository.count() > 0;
    }
}
