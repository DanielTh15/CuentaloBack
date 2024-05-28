package com.example.Cuentalo.Persistence.Mapper;

import com.example.Cuentalo.Domain.Dto.Story;
import com.example.Cuentalo.Persistence.Entity.Historia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {WriterMapper.class, StoryCategoryMapper.class})
public interface StoryMapper {

  @Mappings({
          @Mapping(source = "idHistoria", target = "storyId"),
          @Mapping(source = "titulo", target = "tittle"),
          @Mapping(source = "contenido", target = "content"),
          @Mapping(source = "fecha", target = "date"),
          @Mapping(source = "idAutor", target = "authorId"),
          @Mapping(source = "idSound", target = "soundId"),
          @Mapping(source = "historiador", target = "writer"),
          @Mapping(source = "categorias", target = "categories"),
  })
 Story toStory(Historia historia);

  List<Story> toStories(List<Historia> historias);
  @InheritInverseConfiguration
  Historia toHistoria(Story story);

}
