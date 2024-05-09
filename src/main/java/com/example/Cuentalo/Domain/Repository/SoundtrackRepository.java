package com.example.Cuentalo.Domain.Repository;

import com.example.Cuentalo.Domain.Dto.Soundtrack;

import java.util.List;
import java.util.Optional;

public interface SoundtrackRepository {

  List<Soundtrack> getAll();

  Optional<Soundtrack> getOne(Integer id);

  Soundtrack save(Soundtrack soundtrack);

  void delete(Integer id);

}
