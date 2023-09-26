package org.mk;

public class Main {
    public static void main(String[] args) {

      FactoryUser factoryUser = new FactoryUser();

      Optional<User> user = factoryUser.createUser("khalil");


        System.out.println(user.getObject().name);
    }
}