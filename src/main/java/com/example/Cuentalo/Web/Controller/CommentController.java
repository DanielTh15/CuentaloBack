package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Comment;
import com.example.Cuentalo.Domain.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comment>> getAll(){
        return ResponseEntity.ok(commentService.getAll());
    }

}
