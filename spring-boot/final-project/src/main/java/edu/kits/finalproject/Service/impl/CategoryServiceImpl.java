package edu.kits.finalproject.Service.impl;

import edu.kits.finalproject.Domain.Category;
import edu.kits.finalproject.Repository.CategoryRepository;
import edu.kits.finalproject.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository CategoryRepository;

    @Override
    public Category getById(Long id) {
        return CategoryRepository.getById(id);
    }
    @Override
    public List<Category> getAllCategorys(){
        return CategoryRepository.getAllCategory();
    }

    @Override
    public void flush() {
        CategoryRepository.flush();
    }

    @Override
    public <S extends Category> S saveAndFlush(S entity) {
        return CategoryRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
        return CategoryRepository.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Category> entities) {
        CategoryRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        CategoryRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        CategoryRepository.deleteAllInBatch();
    }

    @Override
    public Category getReferenceById(Long aLong) {
        return CategoryRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example) {
        return CategoryRepository.findAll(example);
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
        return CategoryRepository.findAll(example, sort);
    }

    @Override
    public <S extends Category> List<S> saveAll(Iterable<S> entities) {
        return CategoryRepository.saveAll(entities);
    }

    @Override
    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    @Override
    public List<Category> findAllById(Iterable<Long> longs) {
        return CategoryRepository.findAllById(longs);
    }

    @Override
    public <S extends Category> S save(S entity) {
        return CategoryRepository.save(entity);
    }

    @Override
    public Optional<Category> findById(Long aLong) {
        return CategoryRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return CategoryRepository.existsById(aLong);
    }

    @Override
    public long count() {
        return CategoryRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        CategoryRepository.deleteById(aLong);
    }

    @Override
    public void delete(Category entity) {
        CategoryRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        CategoryRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Category> entities) {
        CategoryRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        CategoryRepository.deleteAll();
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return CategoryRepository.findAll(sort);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return CategoryRepository.findAll(pageable);
    }

    @Override
    public <S extends Category> Optional<S> findOne(Example<S> example) {
        return CategoryRepository.findOne(example);
    }

    @Override
    public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
        return CategoryRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Category> long count(Example<S> example) {
        return CategoryRepository.count(example);
    }

    @Override
    public <S extends Category> boolean exists(Example<S> example) {
        return CategoryRepository.exists(example);
    }

    @Override
    public <S extends Category, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return CategoryRepository.findBy(example, queryFunction);
    }

    @Override
    public Page<Category> findByNameContaining(String name, Pageable pageable) {
        return CategoryRepository.findByNameContaining(name, pageable);
    }

    @Override
    public List<Category> findByNameContaining(String name) {
        return CategoryRepository.findByNameContaining(name);
    }
}
