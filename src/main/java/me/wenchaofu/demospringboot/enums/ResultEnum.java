package me.wenchaofu.demospringboot.enums;

/**
 * @author wenchaofu
 * @date 2018/3/23 16:53
 */
public enum ResultEnum {

    UNKNOE_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能还在上小学"),
    MIDDLE_SCHEOOL(101,"你可能还在上初中")
    ;


    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
