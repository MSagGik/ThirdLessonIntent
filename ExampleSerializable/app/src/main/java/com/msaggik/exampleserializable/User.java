package com.msaggik.exampleserializable;

import java.io.Serializable;

public class User implements Serializable {

    // поля сущности
    private String name;
    private String address;
    private String email;

    // необходимый конструктор
    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
