package com.example.Cuentalo.Domain.Repository;

import com.example.Cuentalo.Domain.Dto.Writer;

import java.util.List;
import java.util.Optional;

public interface WriterRepository {

   List<Writer> getAll();

   Optional<Writer> getOne(String id);

   Writer save(Writer writer);

   void delete(String id);

}
