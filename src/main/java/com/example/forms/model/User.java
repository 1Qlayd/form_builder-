package com.example.forms.model;


import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String hash_password;
    private String email;
    private Long idRole;

    public User(Long id, String username, String hash_password, String email, Long idRole) {
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
