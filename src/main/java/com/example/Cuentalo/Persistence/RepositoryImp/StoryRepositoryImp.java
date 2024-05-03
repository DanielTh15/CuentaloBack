package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Story;
import com.example.Cuentalo.Domain.Repository.StoryRepository;
import com.example.Cuentalo.Persistence.Crud.HistoriaCrud;
import com.example.Cuentalo.Persistence.Entity.Historia;
import com.example.Cuentalo.Persistence.Mapper.StoryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
