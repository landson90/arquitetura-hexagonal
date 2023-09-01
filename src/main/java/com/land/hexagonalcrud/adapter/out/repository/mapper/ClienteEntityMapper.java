package com.land.hexagonalcrud.adapter.out.repository.mapper;

import com.land.hexagonalcrud.adapter.out.repository.entity.ClienteEntity;
import com.land.hexagonalcrud.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {

    @Mapping(target = "id", ignore = true)
    ClienteEntity toCliente(Cliente cliente);

    Cliente toClienteEntity(ClienteEntity clienteEntity);

}
