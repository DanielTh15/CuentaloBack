package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import com.example.Cuentalo.Domain.Repository.SoundtrackRepository;
import com.example.Cuentalo.Persistence.Crud.SoundtrackCrud;
import com.example.Cuentalo.Persistence.Entity.Sonidofondo;
import com.example.Cuentalo.Persistence.Mapper.SoundtrackMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SoundtrackRepositoryImp implements SoundtrackRepository {

    private final SoundtrackCrud soundtrackCrud;
    private final SoundtrackMapper soundtrackMapper;

    public SoundtrackRepositoryImp(SoundtrackCrud soundtrackCrud, SoundtrackMapper soundtrackMapper) {
        this.soundtrackCrud = soundtrackCrud;
        this.soundtrackMapper = soundtrackMapper;
    }

    @Override
    public List<Soundtrack> getAll() {
        List<Sonidofondo> sonidofondos = soundtrackCrud.findAll();
        return soundtrackMapper.toSoundtrack(sonidofondos);
    }

    @Override
    public Optional<Soundtrack> getOne(Integer id) {
        return soundtrackCrud.findById(id).map(soundtrackMapper::toSoundtrack);
    }

    @Override
    public Soundtrack save(Soundtrack soundtrack) {
        Sonidofondo sonidofondo = soundtrackMapper.toSonidoFondo(soundtrack);
        return soundtrackMapper.toSoundtrack(soundtrackCrud.save(sonidofondo));
    }

    @Override
    public void delete(Integer id) {
       soundtrackCrud.deleteById(id);
    }
}
