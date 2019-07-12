package com.luxh.common.resp;

import lombok.Data;

/**
 * @Description 响应报文
 * @Author luxiaohua
 * @Date 2019/7/11
 */
@Data
public class Result<T> {

    private int code;

    private String mesaage;

    private T data;


    public static <T> Result success() {
        return result(Status.OK.getCode(), Status.OK.getMessage(), new Object());
    }

    public static <T> Result success(T data) {
        return result(Status.OK.getCode(), Status.OK.getMessage(), data);
    }

    public static <T> Result fail(int code, String message) {
        return result(code, message, null);
    }

    private static <T> Result result(int code, String mesaage, T data) {
        Result result = new Result();
        result.setCode(code);
        result.setMesaage(mesaage);
        result.setData(data);
        return result;
    }


}
