package com.distributed.keyvaluestore.model;

public class User {
    private String userId;
    private String name;
    private String email;
    private String address;

    public User (String userId, String name, String email, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getUserId () {
        return userId;
    }

    public void setUserId (String userId) {
        this.userId = userId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getAddress () {
        return address;
    }

}
