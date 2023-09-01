package com.land.hexagonalcrud.adapter;

import com.land.hexagonalcrud.adapter.out.repository.ClienteRepository;
import com.land.hexagonalcrud.adapter.out.repository.entity.ClienteEntity;
import com.land.hexagonalcrud.adapter.out.repository.mapper.ClienteEntityMapper;
import com.land.hexagonalcrud.application.core.domain.Cliente;
import com.land.hexagonalcrud.application.port.out.SalvarClienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalvarClienteAdapter implements SalvarClienteOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;


    public SalvarClienteAdapter(ClienteRepository clienteRepository,
                                ClienteEntityMapper clienteEntityMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityMapper = clienteEntityMapper;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        var clienteEnity = clienteEntityMapper.toCliente(cliente);
        var clienteSalvo = clienteRepository.save(clienteEnity);
        return clienteEntityMapper.toClienteEntity(clienteSalvo);
    }
}
