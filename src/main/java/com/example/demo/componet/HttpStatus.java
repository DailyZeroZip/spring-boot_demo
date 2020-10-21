package com.example.demo.componet;

public interface HttpStatus {

    /**
     * 公共状态码
     */
    class Common {

        /**
         * 请求成功
         */
        public static Integer REQUEST_SUCCEEDED = 10000;

        /**
         * 数据错误
         */
        public static Integer REQUEST_VERIFICATION_FAILED = 30000;

        /**
         * 业务错误
         */
        public static Integer REQUEST_BUSINESS_FAILED = 40000;

        /**
         * 参数错误
         */
        public static Integer PARAMETER_BUSINESS_FAILED = 40001;

        /**
         * 网络错误
         */
        public static Integer NETWORK_FAILED = 46002;

        /**
         * 系统异常
         */
        public static Integer SYSTEM_ERROR = 47003;

        /**
         * 终端错误
         */
        public static Integer Terminal_BUSINESS_FAILED = 40009;

        /**
         * 请求错误
         */
        public static Integer REQUEST_FAILED = 50000;

        /**
         * 请求超时
         */
        public static Integer TIME_OUT = 50002;
    }
    }