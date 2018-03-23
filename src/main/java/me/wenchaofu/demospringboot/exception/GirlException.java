package me.wenchaofu.demospringboot.exception;

import me.wenchaofu.demospringboot.enums.ResultEnum;

/**
 * @author wenchaofu
 * @date 2018/3/23 16:40
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
