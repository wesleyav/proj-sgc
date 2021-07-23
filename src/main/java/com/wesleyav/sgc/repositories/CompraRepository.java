package com.wesleyav.sgc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wesleyav.sgc.entities.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

}
