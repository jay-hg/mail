package com.hgc.common.aspect;

import com.hgc.common.util.FastJsonConvertUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Slf4j
public class WebLogAspect {
    @Pointcut("execution(public * com.hgc.*.api.*.*(..))")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //打印接口信息
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info("---------------request start---------------");
        log.info("url={}",request.getRequestURL());
        log.info("method={}",request.getMethod());
        log.info("class_method={}", point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
        log.info("args={}", point.getArgs());

        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;

        log.info("response={}", FastJsonConvertUtil.convertObjectToJSON(result));
        log.info("cost time={}",time);
        log.info("---------------request end---------------");
        return result;
    }
}
