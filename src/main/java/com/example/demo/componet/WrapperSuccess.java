package com.example.demo.componet;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一返回成功数据模型
 *
 */
@Data
public class WrapperSuccess<T> {

    @ApiModelProperty(value = "响应码")
    private int code;

    @ApiModelProperty(value = "响应消息")
    private T data;

    public static <T> WrapperSuccess<T> ok() {
        HttpCode responseCode = HttpCode.SUCCESS;
        return new WrapperSuccess<T>(responseCode.getCode(), null);
    }

    public static <T> WrapperSuccess<T> ok(T data) {
        HttpCode responseCode = HttpCode.SUCCESS;
        return new WrapperSuccess<T>(responseCode.getCode(), data);
    }

    private WrapperSuccess(int code, T data) {
        this.code = code;
        this.data = data;
    }
}
