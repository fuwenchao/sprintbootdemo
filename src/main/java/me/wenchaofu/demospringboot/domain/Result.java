package me.wenchaofu.demospringboot.domain;

/**
 * @author wenchaofu
 * @date 2018/3/23 15:52
 */
public class Result<T> {
    private Integer code;

    private String message;

    private T dates;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDates() {
        return dates;
    }

    public void setDates(T dates) {
        this.dates = dates;
    }
}
