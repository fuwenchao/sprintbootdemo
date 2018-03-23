package me.wenchaofu.demospringboot.controller;


import me.wenchaofu.demospringboot.domain.Result;
import me.wenchaofu.demospringboot.repository.GirlRepository;
import me.wenchaofu.demospringboot.domain.Girl;
import me.wenchaofu.demospringboot.service.GirlService;
import me.wenchaofu.demospringboot.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    /**
     * 查询女生列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        logger.info("getlist .... ");
        return girlRepository.findAll();
    }

    /**
     * 增加一个女生
     *
     * @return
     */
    @PostMapping(value = "/girladd")
    public Result<Girl> addGril(@Valid Girl girl , BindingResult bindingResult) {
//        girl.setAge(girl.getAge());
//        girl.setCupSize(girl.getCupSize());
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());

        }
        return ResultUtil.success(girlRepository.save(girl));

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

    //获取女生年龄进行判断
    @GetMapping(value = "/girl/ageexp/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }

}
