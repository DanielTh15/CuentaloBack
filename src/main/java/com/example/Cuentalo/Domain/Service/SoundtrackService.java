package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Soundtrack;

import java.util.List;
import java.util.Optional;

public interface SoundtrackService {

    List<Soundtrack> getAll();

    Optional<Soundtrack> getOne(Integer id);

    Soundtrack save(Soundtrack soundtrack);

    void delete(Integer id);

}
