package com.utn.program;

public class Login {
    private String userDni;
    private String password;

    public Login() {}
    public Login(String userDni, String password) {
        this.userDni = userDni;
        this.password = password;
    }

    public String getUserDni() {
        return userDni;
    }

    public void setUserDni(String userDni) {
        this.userDni = userDni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
