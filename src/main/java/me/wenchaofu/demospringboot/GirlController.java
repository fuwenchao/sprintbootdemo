package me.wenchaofu.demospringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;


    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girllist(){
        return girlRepository.findAll();
    }

    /**
     * 增加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/addgirls")
    public Girl addGril(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }


     @GetMapping(value = "/getgirl/{id}")
     public Girl getgirl(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);

     }



    @PostMapping(value = "/getgirl")
    public String updateGril(@PathVariable("id") Integer id){

    }
//
//
//    @DeleteMapping(value = "getgirl")
}
