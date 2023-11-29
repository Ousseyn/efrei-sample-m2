// C'est la classe controller d'Item
package fr.efrei.server.web.rest; //Le nom de mon server

import fr.efrei.server.domain.Item;
import fr.efrei.server.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemResource {

    public final ItemService itemService;

    public ItemResource (ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")

    public List<Item> getAllItems(){

        return itemService.findAll();
    }
/*
    public List<Item> getAllItems(){
        return new ArrayList<>();
    }

 */
    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id){

        Item item = new Item ();
        item.setName("Pierre");
        return item;
    }

}
