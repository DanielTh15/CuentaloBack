package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Comment;
import com.example.Cuentalo.Domain.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Comment>> getOne(@PathVariable Integer id){
        return ResponseEntity.ok(commentService.getOne(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Comment> save(@RequestBody Comment comment){
        return ResponseEntity.ok(commentService.save(comment));
    };

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        commentService.delete(id);
        return ResponseEntity.ok().build();
    }

}
