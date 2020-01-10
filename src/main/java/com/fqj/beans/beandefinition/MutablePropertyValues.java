package com.fqj.beans.beandefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 表示bean属性的实现类
 */
public class MutablePropertyValues implements PropertyValues {

    //属性列表
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>(0);
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList =
                (propertyValueList != null ? propertyValueList : new ArrayList<>());
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }

    @Override
    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    @Override
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    @Override
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

    @Override
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }
}
