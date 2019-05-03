package com.hgc.common.exception;

import com.hgc.common.system.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public RestResult systemExceptionHandle(Exception exception) {
        log.error("系统异常：",exception);
        return new RestResult(false,"0","system exception!");
    }
}
