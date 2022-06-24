package com.bosssoft.hr.javase.springexample.util.result;


/**
 * @description 封装响应请求
 * eg：{
 *     msg：“响应成功”，
 *     code：100，
 *     data：{name：“陈童”，age：19}
 * }
 * @author ChenTong
 * @param <T> 响应中的数据 泛型
 */
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(ResultCode resultCode, T data){
        this(resultCode);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }




}

