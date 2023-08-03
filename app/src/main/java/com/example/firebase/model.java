package com.example.firebase;

import android.widget.EditText;

public class model {
    String name;
     String email;
     String password;

    public model() {
    }

    public model(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return password;
    }
    public void setPhone(String password) {
        this.password= password;
    }
}
