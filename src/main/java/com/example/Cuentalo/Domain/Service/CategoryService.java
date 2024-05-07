package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAll();

    Optional<Category> findOne(Integer id);

    Category save(Category category);

    void delete(Integer id);



}
