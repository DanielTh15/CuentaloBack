package com.example.Cuentalo.Domain.Dto;

import java.util.List;

public class Category {

    private Integer CategoriId;
    private String name;
    private String description;


    public Integer getCategoriId() {
        return CategoriId;
    }

    public void setCategoriId(Integer categoriId) {
        CategoriId = categoriId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
