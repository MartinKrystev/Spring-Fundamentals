package com.example.mobilele.repositories;

import com.example.mobilele.domain.entities.UserRole;
import com.example.mobilele.domain.views.UserRoleViewDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {


}
