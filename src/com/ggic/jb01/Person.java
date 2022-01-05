package com.ggic.jb01;

public class Person{

    private String name;
    private String contactNo;
    private String address;

    public static Person create(){
        return new Person();
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person contactNo(String contactNo) {
        this.contactNo = contactNo;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }
    
    public String toString() {
        return "Person { name="+name+",contactNo="+contactNo+",address="+address+"} ";
    }

}
