package com.free.project1.main.model.usuario;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class Usuario {

    @Id
    @Column(name = "id")
    int id;// number;

    @Column(name = "first_name")
    String first_name;// string;

    @Column(name = "second_name")
    String second_name;// string;

    @Column(name = "first_lastname")
    String first_lastname;// string;

    @Column(name = "second_lastname")
    String second_lastname;// string;

    @Column(name = "username")
    String username;// string;

    @Column(name = "password")
    String password;// string;

    @Column(name = "email")
    String email;// string;

    @Column(name = "data")
    String data;// any;

    @Column(name = "role")
    int role;// number;

    @Column(name = "status")
    int status;// number;

    @Column(name = "created")
    Date created;// Date;

    @Column(name = "modified")
    Date modified;// Date;

    public Usuario() {
    }

    public Usuario(int id, String first_name, String second_name, String first_lastname, String second_lastname,
            String username, String password, String email, String data, int role, int status, Date created,
            Date modified) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.first_lastname = first_lastname;
        this.second_lastname = second_lastname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.data = data;
        this.role = role;
        this.status = status;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return this.second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFirst_lastname() {
        return this.first_lastname;
    }

    public void setFirst_lastname(String first_lastname) {
        this.first_lastname = first_lastname;
    }

    public String getSecond_lastname() {
        return this.second_lastname;
    }

    public void setSecond_lastname(String second_lastname) {
        this.second_lastname = second_lastname;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
