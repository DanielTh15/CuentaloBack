package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Story;
import com.example.Cuentalo.Domain.Repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryServiceImp implements StoryService{

    private final StoryRepository storyRepository;

    @Autowired
    public StoryServiceImp(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public List<Story> getAll() {
        return storyRepository.getAll();
    }

    @Override
    public Optional<Story> getOne(Integer id) {
        return storyRepository.getOne(id);
    }

    @Override
    public Story save(Story story) {
        return storyRepository.save(story);
    }

    @Override
    public void delete(Integer id) {
       storyRepository.delete(id);
    }
}
