package com.fqj.beans.factory;

/**
 * 实现创建和注入bean的接口
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 创建bean
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T createBean(Class<T> clazz);

    /**
     * 注入已经存在的bean
     * @param existingBean
     */
    void autowireBean(Object existingBean);
}
