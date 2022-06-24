package com.bosssoft.hr.javase.springexample.util;/*
 *
 * @author DELL
 * @date 2022/06/230030
 **/

import lombok.Data;

import java.io.Serializable;
@Data
public class Results implements Serializable {
    private int code;
    private String msg;
    private  Object data;

    public static Results success(String msg){
        return success(200,msg,null);
    }
    public static Results success(Object data){
        return success(200,"操作成功",data);
    }

    public static Results success(int code, String msg, Object data){
        Results suc=new Results();
        suc.setCode(code);
        suc.setMsg(msg);
        suc.setData(data);
        return suc;
    }
    public static Results fail(String msg){
        return fail(400,msg,null);
    }
    public static Results fail(String msg, Object data){
        return fail(400,msg,data);
    }
    public static Results fail(int code, String msg, Object data){
        Results fail=new Results();
        fail.setCode(code);
        fail.setMsg(msg);
        fail.setData(data);
        return fail;
    }
}
