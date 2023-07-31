package com.example.mobilele.domain.entities;

import com.example.mobilele.domain.enums.ModelCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity{

    @Column
    public String name;

    @Enumerated(EnumType.STRING)
    public ModelCategory category;

    @Column(name = "image-url")
    @Size(min = 8, max = 512)
    public String imageUrl;

    @Column(name = "start-year")
    public Integer startYear;

    @Column(name = "end-year")
    public Integer endYear;

    @Column
    public LocalDateTime created;

    @Column
    public LocalDateTime modified;

    @ManyToOne
    public Brand model;

    public Model() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelCategory getCategory() {
        return category;
    }

    public void setCategory(ModelCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Brand getModel() {
        return model;
    }

    public void setModel(Brand model) {
        this.model = model;
    }
}

