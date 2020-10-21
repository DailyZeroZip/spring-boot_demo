package com.example.demo.componet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一返回失败数据模型
 *
 */
@Data
@ApiModel(value="响应体", description="响应体")
public class WrapperFail {

    @ApiModelProperty(value = "响应码")
    private int code;

    @ApiModelProperty(value = "响应消息")
    private String message;

    public static WrapperFail fail(String errorMessage) {
        return new WrapperFail(HttpCode.BUSINESS_ERROR.getCode(), errorMessage);
    }

    public static WrapperFail fail(int responseCode, String errorMessage) {
        return new WrapperFail(responseCode, errorMessage);
    }


    private WrapperFail(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
