package com.land.hexagonalcrud.adapter.out.repository;


import com.land.hexagonalcrud.adapter.out.repository.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
