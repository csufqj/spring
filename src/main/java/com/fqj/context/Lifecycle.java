package com.fqj.context;

/**
 * bean的生命周期
 */
public interface Lifecycle {

    void start();

    void stop();

    boolean isRunning();
}
