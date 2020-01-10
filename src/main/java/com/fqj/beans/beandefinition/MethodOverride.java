package com.fqj.beans.beandefinition;

import java.lang.reflect.Method;

/**
 * bean方法
 */
public abstract class MethodOverride {

    private final String methodName;

    private boolean overloaded = true;

    public MethodOverride(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isOverloaded() {
        return overloaded;
    }

    public void setOverloaded(boolean overloaded) {
        this.overloaded = overloaded;
    }

    /**
     * 判断方法是否匹配该对象
     * @param method
     * @return
     */
    public abstract boolean matches(Method method);
}
