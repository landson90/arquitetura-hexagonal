package com.land.hexagonalcrud.adapter.in.controller;

import com.land.hexagonalcrud.adapter.in.controller.mapper.RequestClienteMapper;
import com.land.hexagonalcrud.adapter.in.controller.mapper.ResponseClienteMapper;
import com.land.hexagonalcrud.adapter.in.controller.request.ClienteRequestDTO;
import com.land.hexagonalcrud.adapter.in.controller.response.ClienteResponseDTO;
import com.land.hexagonalcrud.application.port.in.SalvarClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/clientes")
public class ClienteController {

    private SalvarClienteInputPort salvarClienteInputPort;
    private RequestClienteMapper requestClienteMapper;
    private ResponseClienteMapper responseClienteMapper;


    public ClienteController(SalvarClienteInputPort salvarClienteInputPort, RequestClienteMapper requestClienteMapper, ResponseClienteMapper responseClienteMapper) {
        this.salvarClienteInputPort = salvarClienteInputPort;
        this.requestClienteMapper = requestClienteMapper;
        this.responseClienteMapper = responseClienteMapper;
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> salvar(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        var cliente = requestClienteMapper.toCliente(clienteRequestDTO);
        var clienteResponse = salvarClienteInputPort.salvar(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteResponseDTO
                .builder()
                        .id(clienteResponse.getId())
                        .email(clienteResponse.getEmail())
                        .nome(clienteResponse.getNome())
                .build());
    }
}
