package com.example.mobilele.services.offer;

import com.example.mobilele.repositories.OfferRepository;
import com.example.mobilele.services.init.DbInit;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DbInit {
    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.offerRepository.count() > 0;
    }
}
