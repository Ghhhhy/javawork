package com.bosssoft.hr.javase.springexample.util.result;


public enum ResultCode {
//    枚举内容
    SUCCESS(0, "请求成功"),
    WEAK_NET_WORK(00002, "网络异常，请稍后重试"),
    RESPONSE_FAIL(00003,"控制器响应失败"),
    AOP_PROCESS_ERR(00004,"AOP JoinPoint process异常"),

    DATA_READ_ERROR(11010,"数据读取异常"),
    INSERT_FAIL(11001,"数据添加失败"),
    DEL_FAIL(11011,"数据删除失败"),

    PASSWORD_ERROR(20001, "用户名或密码错误"),

    PARAMETER_ERROR(30101, "参数错误");


   private int code;
   private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return this.code;
    }

    public String getMsg(){
        return this.msg;
    }
}
