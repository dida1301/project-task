package group.work.store.management.controller;

import group.work.store.management.models.Department;
import group.work.store.management.models.Items;
import group.work.store.management.repository.ItermsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    private ItermsRepository itemsRepository;
    @GetMapping("/Items")
    public List<Items> getItems() {
        return itemsRepository.findAll();
    }
}
