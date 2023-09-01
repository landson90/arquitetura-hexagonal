package com.land.hexagonalcrud.adapter.in.controller.mapper;

import com.land.hexagonalcrud.adapter.in.controller.response.ClienteResponseDTO;
import com.land.hexagonalcrud.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseClienteMapper {

    ClienteResponseDTO toCliente(Cliente cliente);
}
