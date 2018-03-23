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
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girllist() {
        return girlRepository.findAll();
    }

    /**
     * 增加一个女生
     *
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girladd")
    public Girl addGril(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * 通过ID查询女生
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girl/{id}")
    public Girl getgirl(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);

    }


    //通过年龄查询女生
    @GetMapping(value = "/girl/age/{age}")
    public Girl getGirlByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }


    //修改一个女生
    @PostMapping(value = "/girlupdate/{id}")
    public Girl updateGril(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
            Girl girl = new Girl();
            girl.setId(id);
            girl.setAge(age);
            girl.setCupSize(cupSize);
            return girlRepository.save(girl);
    }


    //删除一个女生
    @DeleteMapping(value = "/girldel/{id}")
    public void girldel(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

}
