package edu.kits.finalproject.Repository;

import edu.kits.finalproject.Domain.Category;
import edu.kits.finalproject.Domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p")
    List<Product> getAllProduct();
    List<Product> findByNameContaining(String name);
    Page<Product> findByNameContaining(String name, Pageable pageable);
}