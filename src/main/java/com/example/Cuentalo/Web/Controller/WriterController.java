package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Domain.Service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
