package com.example.Cuentalo.Persistence.Mapper;

import com.example.Cuentalo.Domain.Dto.StoryCategory;
import com.example.Cuentalo.Persistence.Entity.HistoriaCategoria;
import com.example.Cuentalo.Persistence.Entity.HistoriaCategoriaPK;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StoryCategoryMapper {
    @Mappings({
            @Mapping(source = "id.idCategoria", target = "idCategoria")
    })
    StoryCategory toStoryCategory(HistoriaCategoria historiaCategoria);

    List<StoryCategory> toStoryCategory(List<HistoriaCategoria> historiaCategoria);

    @InheritInverseConfiguration
    HistoriaCategoria toHistoriaCategoria(StoryCategory storyCategory);

}
