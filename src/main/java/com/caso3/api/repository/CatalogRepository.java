package com.caso3.api.repository;

import com.caso3.api.model.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalogo, Long> {
}