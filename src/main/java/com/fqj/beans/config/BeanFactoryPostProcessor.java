package com.fqj.beans.config;

/**
 * 自定义修改容器里bean的定义，在所有bean都注册之后调用
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory();
}
