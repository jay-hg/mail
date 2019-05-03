package com.hgc.common.system;

import lombok.Data;

@Data
public class RestResult<T> {
    /**
     * 请求是否成功
     */
    private boolean success;
    /**
     * 成功或者失败的code错误码
     */
    private String code;
    /**
     * 成功时返回的数据，失败时返回具体的异常信息
     */
    private T data;

    private String message;

    public RestResult(boolean success, String code, T data) {
        this.success = success;
        this.code = code;
        this.data = data;
    }
}
