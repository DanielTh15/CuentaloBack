package com.example.Cuentalo.Persistence.Mapper;

import com.example.Cuentalo.Domain.Dto.Comment;
import com.example.Cuentalo.Persistence.Entity.Comentario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mappings({
            @Mapping(source = "idComentario", target = "commentId"),
            @Mapping(source = "contenido", target = "content"),
            @Mapping(source = "idHistoria", target = "storyId")
    })
    Comment toComment(Comentario comentario);
    List<Comment> toComment(List<Comentario> comentario);
    Comentario toComentario(Comment comment);
}
