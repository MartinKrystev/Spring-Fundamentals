package com.example.mobilele.domain.entities;

import com.example.mobilele.domain.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "user-role")
public class UserRole extends BaseEntity {

    @Enumerated(EnumType.STRING)
    public Role role;

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}
