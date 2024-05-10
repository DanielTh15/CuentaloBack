package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Comment;
import com.example.Cuentalo.Domain.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommentServiceImp implements CommentService{

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImp(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAll() {
        return commentRepository.getAll();
    }

    @Override
    public Optional<Comment> getOne(Integer id) {
        return commentRepository.getOne(id);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void delete(Integer id) {
       commentRepository.delete(id);
    }
}
