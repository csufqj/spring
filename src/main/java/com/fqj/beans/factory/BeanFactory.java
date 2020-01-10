package com.fqj.beans.factory;

/**
 * 容器最基础的接口
 */
public interface BeanFactory {

    /**
     * 通过名称得到bean
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 通过类得到bean
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T getBean(Class<T> clazz);

    boolean containsBean(String name);

    /**
     * 是否单例
     * @param name
     * @return
     */
    boolean isSingleton(String name);

    /**
     * 是否原型类（非单例）
     * @param name
     * @return
     */
    boolean isPrototype(String name);
}
