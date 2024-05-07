package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Domain.Repository.WriterRepository;
import com.example.Cuentalo.Persistence.Crud.WriterCrud;
import com.example.Cuentalo.Persistence.Entity.Historiador;
import com.example.Cuentalo.Persistence.Mapper.WriterMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Writer> getOne(String id) {
        return writerCrud.findById(id).map(writerMapper::toWriter);
    }

    @Override
    public Writer save(Writer writer) {
        Historiador historiador = writerMapper.toHistoriador(writer);
        return writerMapper.toWriter(writerCrud.save(historiador));
    }

    @Override
    public void delete(String id) {
      writerCrud.deleteById(id);
    }

}
