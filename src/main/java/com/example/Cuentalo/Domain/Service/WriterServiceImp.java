package com.example.Cuentalo.Domain.Service;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Domain.Repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterServiceImp implements WriterService {


    private final WriterRepository writerRepository;
    @Autowired
    public WriterServiceImp(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    @Override
    public List<Writer> getAll() {
        return writerRepository.getAll();
    }
}
