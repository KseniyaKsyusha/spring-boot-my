package ua.zp.kosse.oksana.tommy.springbootmy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.zp.kosse.oksana.tommy.springbootmy.repository.ProjectRepository;

import java.util.List;

@Service
public class PostMappingService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Item> getAllItems() {
        return projectRepository.getAllItems();
    }

    public String addItems(Item item) {
        projectRepository.addItems(item);
        return "Item added successfully";
    }

    public List<Item> addItemsNS(){
        return projectRepository.addItemsNS();
    }

    public List<Item> addItemsS() {
        return projectRepository.addItemsS();
    }

    public List<Item> addTimeL() {
        return projectRepository.addTimeL();
    }


    public List<Item> addTimeN() {
        return projectRepository.addTimeN();
    }
}
