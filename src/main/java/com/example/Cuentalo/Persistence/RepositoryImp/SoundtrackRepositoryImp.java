package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import com.example.Cuentalo.Domain.Repository.SoundtrackRepository;
import com.example.Cuentalo.Persistence.Crud.SoundtrackCrud;
import com.example.Cuentalo.Persistence.Entity.Sonidofondo;
import com.example.Cuentalo.Persistence.Mapper.SoundtrackMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
