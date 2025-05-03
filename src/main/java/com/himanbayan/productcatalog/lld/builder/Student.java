package com.himanbayan.productcatalog.lld.builder;


import lombok.Getter;

public class Student {
    private String name;
    private String address;
    private double psp;
    private int age;
    private String gender;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder b){
        this.name = b.getName();
        this.age = b.getAge();
        this.address = b.getAddress();
        this.psp = b.getPsp();
    }

    @Getter
    public static class Builder {
        private String name;
        private String address;
        private double psp;
        private int age;
        private String gender;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Student build() throws Exception {
            if(!validate()){
                throw new Exception("Wrong data");
            }
            return new Student(this);
        }

        public boolean validate(){
            if(age<24 && psp<70){
                return false;
            }
            if(age<18){
                return false;
            }
            return true;
        }
    }

}
