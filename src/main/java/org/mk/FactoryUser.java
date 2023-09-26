package org.mk;

public class FactoryUser {

    private final Database db ;


    public FactoryUser() {
        this.db = new Database();
    }


    public Optional<User> createUser(String userName){

        if(isExist(userName))
            return  new ExistUser(db.getUser(userName));

        return new NullObject() ;
    }

    private boolean isExist(String userName) {
        return db.getUser(userName) != null ;
    }

    ;
}
