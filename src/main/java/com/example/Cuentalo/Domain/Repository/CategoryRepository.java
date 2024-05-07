package com.example.Cuentalo.Domain.Repository;

import com.example.Cuentalo.Domain.Dto.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    List<Category> getAll();

    Optional<Category> findOne(Integer id);

    Category save(Category category);

    void delete(Integer id);

}
