package com.example.Cuentalo.Persistence.Crud;

import com.example.Cuentalo.Persistence.Entity.Historiador;
import org.springframework.data.repository.ListCrudRepository;

public interface WriterCrud extends ListCrudRepository<Historiador, String> {
}
