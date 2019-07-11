package com.luxh.common.resp;

/**
 * @Description 状态枚举值
 * @Author luxiaohua
 * @Date 2019/7/11
 */
public enum Status {

    OK(200, "success"),

    BAD_REQUEST(400, "BAD REQUEST"),

    SERVER_ERROR(500, "SERVER ERROR");


    private int code;

    private String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }}
