package com;

public class User {

    String usermname;
    String password;

    public User(String username, String password) {
        this.usermname = username;
        this.password  = password;
    }

    @Override
    public String toString(){
        return "username: " + this.usermname +  ", "+ "password: " + this.password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return usermname.equals(user.usermname);
}

    @Override
    public int hashCode() {
        return usermname.hashCode();
    }
}