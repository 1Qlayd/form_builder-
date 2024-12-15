package com.example.forms.model;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String hash_password;
    private String email;
    private Integer idRole;

    public User(Integer id, String username, String hash_password, String email, Integer idRole) {
        this.id = id;
        this.username = username;
        this.hash_password = hash_password;
        this.email = email;
        this.idRole = idRole;
        
    }

    @Override
    public String toString() {
        return "User{" +
                " id='" + getId() + "'" +
                ", username='" + getUsername() + "'" +
                ", hash_password='" + getHash_password() + "'" +
                ", email='" + getEmail() + "'" +
                ", idRole='" + getIdRole() + "'" +
                "}";
    }
}
