package com.fqj.beans.factory;

/**
 * 实现创建bean和注入bean的逻辑
 */
public abstract class AbstractAutowireCapableBeanFactory implements AutowireCapableBeanFactory {

    @Override
    public <T> T createBean(Class<T> clazz) {
        return null;
    }

    @Override
    public void autowireBean(Object existingBean) {

    }
}
