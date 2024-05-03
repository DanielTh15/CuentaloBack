package com.example.Cuentalo.Domain.Repository;

import com.example.Cuentalo.Domain.Dto.Comment;

import java.util.List;

public interface CommentRepository {

    List<Comment> getAll();

}
