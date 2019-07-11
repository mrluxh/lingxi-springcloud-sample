package com.luxh.common.resp;

import lombok.Data;

/**
 * @Description 响应报文
 * @Author luxiaohua
 * @Date 2019/7/11
 */
@Data
public class Result {

    private int code;

    private String mesaage;

    private Object data;


    public static Result success() {
        return result(Status.OK.getCode(), Status.OK.getMessage(), new Object());
    }

    public static Result success(Object data) {
        return result(Status.OK.getCode(), Status.OK.getMessage(), data);
    }

    public static Result fail(int code, String message) {
        return result(code, message, null);
    }


    private static Result result(int code, String mesaage, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMesaage(mesaage);
        result.setData(data);
        return result;
    }


}
