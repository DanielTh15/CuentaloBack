package com.example.Cuentalo.Domain.Repository;

import com.example.Cuentalo.Domain.Dto.Story;

import java.util.List;
import java.util.Optional;

public interface StoryRepository {

    List<Story> getAll();

    Optional<Story> getOne(Integer id);

    Story save(Story story);

    void delete(Integer id);


}
