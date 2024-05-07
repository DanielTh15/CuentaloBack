package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Writer;

import java.util.List;
import java.util.Optional;

public interface WriterService {

    List<Writer> getAll();

    Optional<Writer> getOne(String id);

    Writer save(Writer writer);

    void delete(String id);



}
