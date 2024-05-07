package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Story;
import com.example.Cuentalo.Domain.Repository.StoryRepository;
import com.example.Cuentalo.Persistence.Crud.HistoriaCrud;
import com.example.Cuentalo.Persistence.Entity.Historia;
import com.example.Cuentalo.Persistence.Mapper.StoryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StoryRepositoryImp implements StoryRepository {

    private final HistoriaCrud historiaCrud;
    private final StoryMapper storyMapper;

    public StoryRepositoryImp(HistoriaCrud historiaCrud, StoryMapper storyMapper) {
        this.historiaCrud = historiaCrud;
        this.storyMapper = storyMapper;
    }

    @Override
    public List<Story> getAll() {
        List<Historia> historias = historiaCrud.findAll();
        return storyMapper.toStories(historias);
    }

    @Override
    public Optional<Story> getOne(Integer id) {
        return historiaCrud.findById(id).map(storyMapper::toStory);
    }

    @Override
    public Story save(Story story) {
        Historia historia = storyMapper.toHistoria(story);
        return storyMapper.toStory(historiaCrud.save(historia));
    }

    @Override
    public void delete(Integer id) {
      historiaCrud.deleteById(id);
    }
}
