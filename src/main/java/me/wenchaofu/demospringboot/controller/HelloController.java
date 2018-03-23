package me.wenchaofu.demospringboot.controller;

import me.wenchaofu.demospringboot.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    @GetMapping(value = "/say/{id}")
    public String say(@PathVariable("id") Integer id){
        return "id " + id ;
//        return girlProperties.getCupSize() ;
//        return "index";
    }
}
