package com.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 向上下文注册MyBeanConfig类，并且注册MyBeanFactoryPostProcessor类
        context.register(MyBeanConfig.class);
        context.register(MyBeanFactoryPostProcessor.class);
        // 刷新上下文
        context.refresh();
        // 获取Website实例
        Website website = context.getBean(Website.class);
        // 打印Website实例的地址
        website.showAddress();
    }
}
