package com.sds5.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds5.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
