package fr.efrei.server.service;

//import fr.efrei.server.domain.Item;
import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.List;


@Service


public class ItemService {

    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}
