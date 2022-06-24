package com.bosssoft.hr.javase.springexample.util;

import com.bosssoft.hr.javase.springexample.util.result.Result;
import com.bosssoft.hr.javase.springexample.util.result.ResultCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 响应封装工具类
 * @date 2020/6/5
 * @author ChenTong
 */
public class ResultUtil {
    private ResultUtil(){}

    public static Result success(Object data) {
        return new Result<>(ResultCode.SUCCESS, data);
    }

    //    创建新的提示返回信息
    public static Result warn(ResultCode resultCode, String msg) {
        Result<Object> result = new Result<>(resultCode);
        result.setMsg(msg);
        return result;
    }

    //    使用已有的返回信息
    public static Result warn(ResultCode resultCode) {
        List<Object> objects = new ArrayList<>();
        return new Result<>(resultCode,objects);
    }
}
