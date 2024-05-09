package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Story;

import java.util.List;
import java.util.Optional;

public interface StoryService {

   List<Story> getAll();

   Optional<Story> getOne(Integer id);

   Story save(Story story);

   void delete(Integer id);

}
