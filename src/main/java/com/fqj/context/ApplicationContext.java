package com.fqj.context;

import com.fqj.beans.factory.AutowireCapableBeanFactory;
import com.fqj.beans.factory.BeanFactory;

/**
 * 供开发者调用的接口，原则上开发者只需使用该接口与容器互动,使用beanFactory实现逻辑
 */
public interface ApplicationContext extends BeanFactory {

    /**
     * 容器第一次加载的时间，毫秒
     * @return
     */
    long getStartupDate();

    /**
     * 获取可实现注入和创建bean的容器
     * @return
     */
    AutowireCapableBeanFactory getAutowireCapableBeanFactory();
}
