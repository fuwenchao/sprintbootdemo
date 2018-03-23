package me.wenchaofu.demospringboot.service;

import me.wenchaofu.demospringboot.domain.Girl;
import me.wenchaofu.demospringboot.enums.ResultEnum;
import me.wenchaofu.demospringboot.exception.GirlException;
import me.wenchaofu.demospringboot.repository.GirlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenchaofu
 * @date 2018/3/23 16:12
 */
@Service
public class GirlService {

    private final  static Logger logger = LoggerFactory.getLogger(GirlService.class);

    @Autowired
    GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        logger.info("age in getAge = {}",age);
        if(age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHEOOL);
        }else{

        }
    }
}
