package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Domain.Repository.WriterRepository;
import com.example.Cuentalo.Persistence.Crud.WriterCrud;
import com.example.Cuentalo.Persistence.Entity.Historiador;
import com.example.Cuentalo.Persistence.Mapper.WriterMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WriterRepositoryImp implements WriterRepository {

    private final WriterCrud writerCrud;
    private final WriterMapper writerMapper;

    public WriterRepositoryImp(WriterCrud writerCrud, WriterMapper writerMapper) {
        this.writerCrud = writerCrud;
        this.writerMapper = writerMapper;
    }

    @Override
    public List<Writer> getAll() {
        List<Historiador> historiadores = writerCrud.findAll();
        return writerMapper.toWriters(historiadores);
    }
}
