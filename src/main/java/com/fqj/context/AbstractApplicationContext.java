package com.fqj.context;

import com.fqj.beans.config.BeanFactoryPostProcessor;
import com.fqj.beans.factory.AutowireCapableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现了主要的容器刷新逻辑,持有一个beanFactory
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    private final List<BeanFactoryPostProcessor> beanFactoryPostProcessors = new ArrayList<>();

    private long startupDate;

    private final

    @Override
    public long getStartupDate() {
        return startupDate;
    }

    @Override
    public AutowireCapableBeanFactory getAutowireCapableBeanFactory() {
        return null;
    }

    @Override
    public Object getBean(String name) {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public boolean isSingleton(String name) {
        return false;
    }

    @Override
    public boolean isPrototype(String name) {
        return false;
    }
}
