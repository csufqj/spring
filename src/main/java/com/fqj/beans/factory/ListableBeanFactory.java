package com.fqj.beans.factory;

/**
 * 包含bean的信息接口，管理注册bean
 */
public interface ListableBeanFactory extends BeanFactory {

    boolean containsBeanDefinition(String beanName);

    /**
     * 返回所有的bean定义的名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
