package com.example.Cuentalo.Persistence.Crud;

import com.example.Cuentalo.Persistence.Entity.Sonidofondo;
import org.springframework.data.repository.ListCrudRepository;

public interface SoundtrackCrud extends ListCrudRepository<Sonidofondo, Integer> {
}
