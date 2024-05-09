package com.example.Cuentalo.Web.Controller;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import com.example.Cuentalo.Domain.Service.SoundtrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/soundtrack")
public class SoundtrackController {

    private final SoundtrackService soundtrackService;

    @Autowired
    public SoundtrackController(SoundtrackService soundtrackService) {
        this.soundtrackService = soundtrackService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Soundtrack>> getAll(){
        return ResponseEntity.ok(soundtrackService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Soundtrack>> getOne(@PathVariable Integer id){
        return ResponseEntity.ok(soundtrackService.getOne(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Soundtrack> save(@RequestBody Soundtrack soundtrack){
        return ResponseEntity.ok(soundtrackService.save(soundtrack));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        soundtrackService.delete(id);
        return ResponseEntity.ok().build();
    }

}
