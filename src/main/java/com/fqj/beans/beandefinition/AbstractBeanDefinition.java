package com.fqj.beans.beandefinition;

/**
 * 通用的抽象类实现bean定义
 */
public abstract class AbstractBeanDefinition implements BeanDefinition {

    //beanClass或者beanClassName，可能为类型，也可能为类名称，使用xml时读取的是类名称
    private volatile Object beanClass;

    private boolean abstractFlag = false;

    private boolean lazyInit = false;

    private String scope = "";

    //构造器参数
    private ConstructorArgumentValue constructorArgumentValue;

    //类变量
    private MutablePropertyValues propertyValues;

    //方法
    private MethodOverrides methodOverrides = new MethodOverrides();

    public AbstractBeanDefinition() {
    }

    public AbstractBeanDefinition(ConstructorArgumentValue cargs, MutablePropertyValues pvs) {
        this.constructorArgumentValue = (cargs != null ? cargs : new ConstructorArgumentValue());
        this.propertyValues = (pvs != null ? pvs : new MutablePropertyValues());
    }

    @Override
    public void setBeanClassName(String beanClassName) {
        this.beanClass = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        Object beanClassObject = this.beanClass;
        if (beanClassObject instanceof Class) {
            return ((Class<?>) beanClassObject).getName();
        }
        else {
            return (String)beanClassObject;
        }
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        Object beanClassObject = this.beanClass;
        if (beanClassObject == null) {
            throw new IllegalStateException("No bean class specified on bean definition");
        }
        if (!(beanClassObject instanceof Class)) {
            throw new IllegalStateException(
                    "Bean class name [" + beanClassObject + "] has not been resolved into an actual Class");
        }
        return (Class<?>) beanClassObject;
    }

    public boolean hasBeanClass() {
        return this.beanClass instanceof Class;
    }

    /**
     * 通过beanName解析为beanClass
     * @return
     */
    public Class<?> resolveBeanClass() throws ClassNotFoundException {
        String className = getBeanClassName();
        if (className == null) {
            return null;
        }
        Class<?> resolvedClass = Class.forName(className);
        this.beanClass = resolvedClass;
        return resolvedClass;
    }

    @Override
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    @Override
    public boolean isLazyInit() {
        return lazyInit;
    }

    @Override
    public boolean isSingleton() {
        return scope.equals("") || scope.equals("singleton");
    }

    @Override
    public boolean isPrototype() {
        return scope.equals("prototype");
    }

    public void setAbstract(boolean abstractFlag) {
        this.abstractFlag = abstractFlag;
    }

    @Override
    public boolean isAbstract() {
        return this.abstractFlag;
    }
}
