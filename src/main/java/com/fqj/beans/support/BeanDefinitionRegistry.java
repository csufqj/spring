package com.fqj.beans.support;

import com.fqj.beans.beandefinition.BeanDefinition;

/**
 * bean信息注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
