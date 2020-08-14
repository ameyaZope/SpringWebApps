package com.ameya.demomongdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ameya.demomongdb.entities.Item;

import java.util.List;

public interface ItemRepository extends MongoRepository<Item, String> {
    List<Item> findByItemName(String itemName);
}
