package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Story;
import com.example.Cuentalo.Domain.Service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/story")
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Story>> getAll(){
        return ResponseEntity.ok(storyService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Story>> getOne(@PathVariable Integer id){
        return ResponseEntity.ok(storyService.getOne(id));
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<Story> save(@RequestBody Story story){
        return ResponseEntity.ok(storyService.save(story));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        return null;
    }

}
