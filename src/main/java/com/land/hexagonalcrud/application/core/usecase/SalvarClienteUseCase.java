package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.Cliente;
import com.land.hexagonalcrud.application.port.in.SalvarClienteInputPort;
import com.land.hexagonalcrud.application.port.out.SalvarClienteOutputPort;

public class SalvarClienteUseCase implements SalvarClienteInputPort {


    private final SalvarClienteOutputPort salvarClienteOutputPort;

    public SalvarClienteUseCase(SalvarClienteOutputPort salvarClienteOutputPort) {
        this.salvarClienteOutputPort = salvarClienteOutputPort;
    }


    @Override
    public Cliente salvar(Cliente cliente) {
        return salvarClienteOutputPort.salvar(cliente);
    }
}
