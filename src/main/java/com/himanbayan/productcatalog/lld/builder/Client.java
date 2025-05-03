package com.himanbayan.productcatalog.lld.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student s = Student.getBuilder()
                .setName("Himan")
                .setAge(38)
                .setGender("M")
                .setPsp(87.0)
                .build();
    }
}
