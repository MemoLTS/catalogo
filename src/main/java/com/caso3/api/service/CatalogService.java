package com.caso3.api.service;

import com.caso3.api.client.ProductClient;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    private final ProductClient productClient;

    public CatalogService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public String verCatalogo() {
        return productClient.obtenerProductos();
    }
}