package com.example.Cuentalo.Web.Controller;


import com.example.Cuentalo.Domain.Dto.Category;
import com.example.Cuentalo.Domain.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    @CrossOrigin("http://localhost:4200")
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(categoryService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getOne(@PathVariable Integer id){
        return ResponseEntity.ok(categoryService.findOne(id));
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));
    }
    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }
}
