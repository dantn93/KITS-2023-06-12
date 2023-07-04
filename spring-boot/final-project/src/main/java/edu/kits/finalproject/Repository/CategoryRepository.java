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
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("SELECT c FROM Category c")
    List<Category> getAllCategory();

    @Query("SELECT c FROM Category c WHERE c.categoryId = ?1")
    Category getById(Long id);

    List<Category> findByNameContaining(String name);
    Page<Category> findByNameContaining(String name, Pageable pageable);
}
