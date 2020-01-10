package com.fqj.beans.beandefinition;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 构造器参数
 */
public class ConstructorArgumentValue {

    private final Map<Integer, ValueHolder> indexedArgumentValues = new HashMap<>();

    private final List<ValueHolder> genericArgumentValues = new LinkedList<>();

    public ConstructorArgumentValue() {
    }

    /**
     * 构造器持有的参数
     */
    public static class ValueHolder {

        private Object value;

        private String type;

        private String name;

        public ValueHolder(Object value) {
            this.value = value;
        }

        public ValueHolder(Object value, String type) {
            this.value = value;
            this.type = type;
        }

        public ValueHolder(Object value, String type, String name) {
            this.value = value;
            this.type = type;
            this.name = name;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
