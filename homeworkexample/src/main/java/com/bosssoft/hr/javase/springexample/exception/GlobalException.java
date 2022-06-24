package  com.bosssoft.hr.javase.springexample.exception;


import com.bosssoft.hr.javase.springexample.util.result.ResultCode;

/**
 * 结果异常，会被 ExceptionHandler捕捉并result类对象的json格式返回给前端
 * @author ChenTong
 * @date 2020/6/5
 */
public class GlobalException extends RuntimeException {

    private final ResultCode resultCode;

    public GlobalException(ResultCode resultCode, Throwable cause) {
        super(resultCode.getMsg(),cause);
        this.resultCode = resultCode;
    }


    public ResultCode getResultCode() {
        return resultCode;
    }
}
