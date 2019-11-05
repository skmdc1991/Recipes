package com.example.demo.repository;

import com.example.demo.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface RecipeRepository extends CrudRepository<Item, Long> {
    Item findByItemId(String itemId);
    @Transactional
    void deleteByItemId(String itemId);
}
