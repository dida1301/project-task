package group.work.store.management.controller;

import group.work.store.management.models.Store;
import group.work.store.management.repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StoreController {
    @Autowired
    private  StoreRepo storeRepo;

    @GetMapping("/store")
    public List<Store> getStore(){
        return  storeRepo.findAll();
    }
}
