package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Comment;
import com.example.Cuentalo.Domain.Repository.CommentRepository;
import com.example.Cuentalo.Persistence.Crud.ComentarioCrud;
import com.example.Cuentalo.Persistence.Entity.Comentario;
import com.example.Cuentalo.Persistence.Mapper.CommentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentRepositoryImp implements CommentRepository {


    private final ComentarioCrud comentarioCrud;
    private final CommentMapper commentMapper;

    public CommentRepositoryImp(ComentarioCrud comentarioCrud, CommentMapper commentMapper) {
        this.comentarioCrud = comentarioCrud;
        this.commentMapper = commentMapper;
    }

    @Override
    public List<Comment> getAll() {
        List<Comentario> comentarios = comentarioCrud.findAll();
        return commentMapper.toComment(comentarios);
    }
}
