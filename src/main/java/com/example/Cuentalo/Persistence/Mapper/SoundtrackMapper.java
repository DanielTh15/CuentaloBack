package com.example.Cuentalo.Persistence.Mapper;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import com.example.Cuentalo.Persistence.Entity.Sonidofondo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SoundtrackMapper {
    @Mappings({
            @Mapping(source = "idSoundtrack", target = "soundtrackId"),
            @Mapping(source = "autor", target = "author"),
            @Mapping(source = "direccion", target = "direction")
    })
    Soundtrack toSoundtrack(Sonidofondo sonidofondo);

    List<Soundtrack> toSoundtrack(List<Sonidofondo> sonidofondo);
    @InheritInverseConfiguration
    Sonidofondo toSonidoFondo(Soundtrack soundtrack);

}
