package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Domain.Service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/writer")
public class WriterController {

    private final WriterService writerService;
    @Autowired
    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Writer>> getAll(){
        return ResponseEntity.ok(writerService.getAll());
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Writer>> getOne(@PathVariable String id){
        return ResponseEntity.ok(writerService.getOne(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Writer> save(@RequestBody Writer writer){
        return ResponseEntity.ok(writerService.save(writer));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        writerService.delete(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/update")
    public ResponseEntity<Writer> update(@RequestBody Writer writer){
        return ResponseEntity.ok(writerService.save(writer));
    }
}
