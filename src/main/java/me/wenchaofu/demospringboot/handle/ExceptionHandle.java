package me.wenchaofu.demospringboot.handle;

import me.wenchaofu.demospringboot.domain.Result;
import me.wenchaofu.demospringboot.exception.GirlException;
import me.wenchaofu.demospringboot.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenchaofu
 * @date 2018/3/23 16:32
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if( e instanceof GirlException){
            GirlException ge = (GirlException) e;
            return ResultUtil.error(ge.getCode(),ge.getMessage());
        }else{
            logger.error("[系统错误] {}",e);
            return ResultUtil.error(-1,"unknow error");
        }
    }
}
