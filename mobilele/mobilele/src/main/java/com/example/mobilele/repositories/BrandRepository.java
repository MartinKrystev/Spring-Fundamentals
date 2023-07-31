package com.example.mobilele.repositories;

import com.example.mobilele.domain.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {

}

