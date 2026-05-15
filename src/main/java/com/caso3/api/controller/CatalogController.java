package com.caso3.api.controller;

import com.caso3.api.model.Catalogo;
import com.caso3.api.repository.CatalogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/productos")
public class CatalogController {

    private final CatalogRepository repo;

    public CatalogController(CatalogRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Catalogo> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Catalogo guardar(@RequestBody Catalogo catalogo) {
        return repo.save(catalogo);
    }
}