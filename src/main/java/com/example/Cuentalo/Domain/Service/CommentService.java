package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {

    List<Comment> getAll();

    Optional<Comment> getOne(Integer id);

    Comment save(Comment comment);

    void delete(Integer id);


}
