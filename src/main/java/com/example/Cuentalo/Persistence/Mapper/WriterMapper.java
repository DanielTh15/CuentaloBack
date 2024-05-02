package com.example.Cuentalo.Persistence.Mapper;

import com.example.Cuentalo.Domain.Dto.Writer;
import com.example.Cuentalo.Persistence.Entity.Historiador;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WriterMapper {

    @Mappings({
            @Mapping(source = "idHistoriador", target = "writerId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "celular", target = "phone"),
            @Mapping(source = "correo", target = "mail"),
            @Mapping(source = "ciudad", target = "city"),
            @Mapping(source = "direccion", target = "address"),

    })
     Writer toWriter(Historiador historiador);

     List<Writer> toWriters(List<Historiador> historiadores);

     @InheritInverseConfiguration
     Historiador toHistoriador(Writer writer);
}
