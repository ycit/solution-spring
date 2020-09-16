package com.ycit.lifecycle.ioc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chenxiaolei
 * @date 2019/9/18
 */
//@Slf4j
@Component
public class Bean2 {

    private static final Logger log = LoggerFactory.getLogger(Bean2.class);


    private Bean bean;

    @Resource
    public void setBean(Bean bean) {
        log.info("set method run ...");
        this.bean = bean;
    }
}
