package com.fqj.beans.beandefinition;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 持有bean方法的容器
 */
public class MethodOverrides {

    private final Set<MethodOverride> overrides = new LinkedHashSet<>();

    private volatile boolean modified = false;

    public MethodOverrides() {
    }

    public MethodOverrides(MethodOverrides other) {
        addOverrides(other);
    }

    public void addOverrides(MethodOverrides other) {
        if (other != null) {
            this.modified = true;
            this.overrides.addAll(other.overrides);
        }
    }

    public void addOverride(MethodOverride override) {
        this.modified = true;
        this.overrides.add(override);
    }

    public Set<MethodOverride> getOverrides() {
        return overrides;
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }
}
