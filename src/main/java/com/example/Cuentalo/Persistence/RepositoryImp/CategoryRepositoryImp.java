package com.example.Cuentalo.Persistence.RepositoryImp;

import com.example.Cuentalo.Domain.Dto.Category;
import com.example.Cuentalo.Domain.Repository.CategoryRepository;
import com.example.Cuentalo.Persistence.Crud.CategoryCrud;
import com.example.Cuentalo.Persistence.Entity.Categoria;
import com.example.Cuentalo.Persistence.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImp implements CategoryRepository{

    private final CategoryCrud categoryCrud;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryRepositoryImp(CategoryCrud categoryCrud, CategoryMapper categoryMapper) {
        this.categoryCrud = categoryCrud;
        this.categoryMapper = categoryMapper;
    }


    @Override
    public List<Category> getAll() {
        List<Categoria> categorias =  categoryCrud.findAll();
        return categoryMapper.toCategories(categorias);
    }

    @Override
    public Optional<Category> findOne(Integer id) {
        return categoryCrud.findById(id).map(categoryMapper::toCategory);
    }

    @Override
    public Category save(Category category) {
        Categoria categoria = categoryMapper.toCategoria(category);
        return categoryMapper.toCategory(categoryCrud.save(categoria));
    }

    @Override
    public void delete(Integer id) {
       categoryCrud.deleteById(id);
    }



}

