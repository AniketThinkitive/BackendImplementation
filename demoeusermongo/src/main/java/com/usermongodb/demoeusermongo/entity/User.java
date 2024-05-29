package com.usermongodb.demoeusermongo.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    private int id;
    private String uname;
    private String utype;

    public User(int id, String uname, String utype) {
        this.id = id;
        this.uname = uname;
        this.utype = utype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

}


