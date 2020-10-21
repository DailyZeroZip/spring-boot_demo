package com.example.demo.componet;

public enum HttpCode {

    /**
     * 成功
     */
    SUCCESS(HttpStatus.Common.REQUEST_SUCCEEDED, ""),

    /**
     * 失败
     */
    BUSINESS_ERROR(HttpStatus.Common.REQUEST_FAILED, "BUSINESS_ERROR");



    private int code;

    private String message;

    HttpCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
