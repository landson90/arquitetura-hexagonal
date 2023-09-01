package com.land.hexagonalcrud.config;

import com.land.hexagonalcrud.adapter.SalvarClienteAdapter;
import com.land.hexagonalcrud.application.core.usecase.SalvarClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalvarClienteConfig {

    @Bean
    public SalvarClienteUseCase salvarClienteUseCase(SalvarClienteAdapter salvarClienteAdapter) {
        return new SalvarClienteUseCase(salvarClienteAdapter);
    }
}
