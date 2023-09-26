package org.mk;

public class ExistUser extends Optional {

    private final User existUser;

    public ExistUser(User existUser) {
        this.existUser = existUser;
    }

    @Override
    public User getObject() {
        return this.existUser;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
