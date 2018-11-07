package com;

 class User {

    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password  = password;
    }

    @Override
    public String toString(){
        return "username: " + this.username +  ", "+ "password: " + this.password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return username.equals(user.username);
}

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}