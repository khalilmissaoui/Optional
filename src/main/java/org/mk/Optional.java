package org.mk;

public abstract class Optional<T> {

    private T object;
    public abstract T getObject();
    public abstract boolean isNull();

}
