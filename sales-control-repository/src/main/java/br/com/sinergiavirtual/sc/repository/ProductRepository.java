package br.com.sinergiavirtual.sc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sinergiavirtual.sc.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
