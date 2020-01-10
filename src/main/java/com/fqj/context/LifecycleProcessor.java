package com.fqj.context;

/**
 * 生命周期调度
 */
public interface LifecycleProcessor extends Lifecycle {

    void onRefresh();

    void onClose();
}
