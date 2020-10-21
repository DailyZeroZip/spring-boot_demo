package com.example.demo.componet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 统一返回数据模型
 *
 */
@Data
@ApiModel(value="响应体", description="响应体")
@Accessors(chain = true)
public class Wrapper<T> {

    @ApiModelProperty(value = "响应码")
    private int code;

    @ApiModelProperty(value = "响应消息")
    private String message;

    @ApiModelProperty(value = "响应数据")
    private T data;

    public static <T> Wrapper<T> ok() {
        HttpCode responseCode = HttpCode.SUCCESS;
        return new Wrapper<T>(responseCode.getCode(), responseCode.getMessage(), null);
    }

    public static <T> Wrapper<T> ok(T data) {
        HttpCode responseCode = HttpCode.SUCCESS;
        return new Wrapper<T>(responseCode.getCode(), responseCode.getMessage(), data);
    }

    public static <T> Wrapper<T> fail(HttpCode responseCode) {
        return new Wrapper<T>(responseCode.getCode(), responseCode.getMessage(), null);
    }

    public static <T> Wrapper<T> fail(String errorMessage) {
        return new Wrapper<T>(HttpCode.BUSINESS_ERROR.getCode(), errorMessage, null);
    }

    public static <T> Wrapper<T> fail(int responseCode, String errorMessage) {
        return new Wrapper<T>(responseCode, errorMessage, null);
    }

    public static <T> Wrapper<T> fail(HttpCode responseCode, String errorMessage) {
        return new Wrapper<T>(responseCode.getCode(), errorMessage, null);
    }

    public Wrapper(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 判断是否成功
     * @param code
     * @return
     */
    public static boolean isSuccess(int code){
        if (code == HttpStatus.Common.REQUEST_SUCCEEDED){
            return true;
        }
        return false;
    }

}
