package com.example.Cuentalo.Persistence.Crud;

import com.example.Cuentalo.Persistence.Entity.Categoria;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryCrud extends ListCrudRepository<Categoria, Integer> {
}
