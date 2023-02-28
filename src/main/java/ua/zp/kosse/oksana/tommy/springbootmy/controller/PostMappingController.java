package ua.zp.kosse.oksana.tommy.springbootmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.zp.kosse.oksana.tommy.springbootmy.service.Item;
import ua.zp.kosse.oksana.tommy.springbootmy.service.PostMappingService;

import java.util.List;

@RestController
@RequestMapping("/register-compilation-time")
public class PostMappingController {

    @Autowired
    PostMappingService service;

    @GetMapping("/projects")
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping("/addItems")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addItems(@RequestBody Item item) {
        return service.addItems(item);
    }

    @GetMapping("/failed-results")
    public List<Item> addItemsNS() {
        return service.addItemsNS();
    }

    @GetMapping("/success-result")
    public List<Item> addItemS() {
        return service.addItemsS();
    }

    @GetMapping("long-compilation")
    public List<Item> addTimeL() {
        return service.addTimeL();
    }

    @GetMapping("normal-compilation")
    public List<Item> addTimeN(){
        return service.addTimeN();
    }
}
