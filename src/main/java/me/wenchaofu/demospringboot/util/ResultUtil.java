package me.wenchaofu.demospringboot.util;

import me.wenchaofu.demospringboot.domain.Result;

/**
 * @author wenchaofu
 * @date 2018/3/23 16:00
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(2);
        result.setMessage("success");
        result.setDates(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }
    public static  Result error(Integer code ,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
