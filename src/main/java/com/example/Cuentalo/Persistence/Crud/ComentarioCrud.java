package com.example.Cuentalo.Persistence.Crud;

import com.example.Cuentalo.Persistence.Entity.Comentario;
import org.springframework.data.repository.ListCrudRepository;

public interface ComentarioCrud extends ListCrudRepository<Comentario, Integer> {
}
