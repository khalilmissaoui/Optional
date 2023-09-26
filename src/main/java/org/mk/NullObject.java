package org.mk;

public class NullObject extends Optional {
    @Override
    public User getObject() {
        return new User("null");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
