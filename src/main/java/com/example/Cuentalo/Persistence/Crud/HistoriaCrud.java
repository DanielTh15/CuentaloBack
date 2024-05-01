package com.example.Cuentalo.Persistence.Crud;

import com.example.Cuentalo.Persistence.Entity.Historia;
import org.springframework.data.repository.ListCrudRepository;

public interface HistoriaCrud extends ListCrudRepository<Historia, Integer> {
}
