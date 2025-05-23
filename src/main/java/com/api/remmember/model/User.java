package com.api.remmember.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users") // ตั้งชื่อ table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ให้ gen id อัตโนมัติ
    private Long id;

    @NotBlank(message = "Username ห้ามว่าง")
    private String username;

    @NotBlank(message = "Password ห้ามว่าง")
    private String password;

    @Email(message = "Email ไม่ถูกต้อง")
    @NotBlank(message = "Email ห้ามว่าง")
    private String email;

    // === GETTER/SETTER ===
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
