package com.land.hexagonalcrud.application.port.out;

import com.land.hexagonalcrud.application.core.domain.Cliente;

public interface SalvarClienteOutputPort {
    Cliente salvar(Cliente cliente);
}
