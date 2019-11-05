package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public List<Item> getAll() {
        return (List<Item>) recipeRepository.findAll();
    }

    public Item add(Item item) {
        if (item != null) {
            return recipeRepository.save(item);
        }
        return null;
    }

    public void delete(String itemId) {
        recipeRepository.deleteByItemId(itemId);
    }

    public Item update(String id, Item item) {
        Item updateItem = recipeRepository.findByItemId(id);

        if (updateItem != null) {
            item.setItemId(id);
            return recipeRepository.save(item);
        }
        return null;
    }
}
