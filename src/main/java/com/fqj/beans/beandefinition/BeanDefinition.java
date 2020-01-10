package com.fqj.beans.beandefinition;

/**
 * Bean信息，用来创建bean
 */
public interface BeanDefinition {

    void setBeanClassName(String beanClassName);

    String getBeanClassName();

    /**
     * 设置bean的作用域（是否单例）
     * @param scope
     */
    void setScope(String scope);

    String getScope();

    /**
     * 设置是否延迟加载
     * @param lazyInit
     */
    void setLazyInit(boolean lazyInit);

    boolean isLazyInit();

    boolean isSingleton();

    boolean isPrototype();

    boolean isAbstract();
}
