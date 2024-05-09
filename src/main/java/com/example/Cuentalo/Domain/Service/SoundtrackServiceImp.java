package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import com.example.Cuentalo.Domain.Repository.SoundtrackRepository;
import com.example.Cuentalo.Persistence.Entity.Sonidofondo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoundtrackServiceImp implements SoundtrackService{

    private final SoundtrackRepository soundtrackRepository;

    @Autowired
    public SoundtrackServiceImp(SoundtrackRepository soundtrackRepository) {
        this.soundtrackRepository = soundtrackRepository;
    }


    @Override
    public List<Soundtrack> getAll() {
        return soundtrackRepository.getAll();
    }

    @Override
    public Optional<Soundtrack> getOne(Integer id) {
        return soundtrackRepository.getOne(id);
    }

    @Override
    public Soundtrack save(Soundtrack soundtrack) {
        return soundtrackRepository.save(soundtrack);
    }

    @Override
    public void delete(Integer id) {
       soundtrackRepository.delete(id);
    }
}
