package com.example.mobilele.domain.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    public String username;

    @Column
    public String password;

    @Column(name = "first-name")
    public String firstName;

    @Column(name = "last-name")
    public String lastName;

    @Column(name = "is-active")
    public boolean isActive;

    @OneToOne
    public UserRole role;

    @Column(name = "image-url")
    public String imageUrl;

    @Column
    public String created;

    @Column
    public String modified;

    public User() {}

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public User setActive(boolean active) {
        isActive = active;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public User setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public User setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public User setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public User setModified(String modified) {
        this.modified = modified;
        return this;
    }
}
