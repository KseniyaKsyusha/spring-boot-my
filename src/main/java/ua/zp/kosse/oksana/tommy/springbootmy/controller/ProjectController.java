package ua.zp.kosse.oksana.tommy.springbootmy.controller;

import org.springframework.web.bind.annotation.*;
import ua.zp.kosse.oksana.tommy.springbootmy.service.DataService;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("/rest")
public class ProjectController {

    // @RequestMapping(value="/register-compilation-time", method = RequestMethod.POST, consumes = "application/json")
    @PostMapping(consumes = "application/json")
    public String getData(@RequestBody DataService dataprojects){
        return String.format(" project %s timestamp  %s compilationTime  %s result %s" , dataprojects.getProject(),
                dataprojects.getTimestamp(), dataprojects.getCompilationTime(), dataprojects.getResult());

    }
}
