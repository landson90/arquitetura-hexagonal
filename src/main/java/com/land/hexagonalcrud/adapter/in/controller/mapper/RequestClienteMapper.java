package com.land.hexagonalcrud.adapter.in.controller.mapper;

import com.land.hexagonalcrud.adapter.in.controller.request.ClienteRequestDTO;
import com.land.hexagonalcrud.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RequestClienteMapper {

    @Mapping(target = "id", ignore = true)
    Cliente toCliente(ClienteRequestDTO dto);


}
