package com.land.hexagonalcrud.application.port.in;

import com.land.hexagonalcrud.application.core.domain.Cliente;

public interface SalvarClienteInputPort {

    Cliente salvar(Cliente cliente);
}
