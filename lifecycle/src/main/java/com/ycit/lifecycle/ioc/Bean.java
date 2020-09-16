package com.ycit.lifecycle.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chenxiaolei
 * @date 2019/9/18
 */
@Slf4j
@Component
public class Bean implements BeanNameAware, BeanFactoryAware {

    public Bean() {
        System.out.println("run bean default construct ..");
    }
    private Bean2 bean2;

    @Resource
    public void setBean2(Bean2 bean2) {
        log.info("set method run .......................");
        this.bean2 = bean2;
    }

    @Override
    public void setBeanName(String name) {
        log.info("beanNameAware set method run ........................");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("BeanFactoryAware set method run ........................");
    }
}
