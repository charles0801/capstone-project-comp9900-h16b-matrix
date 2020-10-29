package com.matrix.filmfinder.model;

//import com.alibaba.fastjson.JSON;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    @NonNull
    private Integer id;
    @Column
//    @NonNull
    private String name;
    @Column
    @NonNull
    private String email;
    @Column
    private String password;
    @Column
    private String oauth2_token;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String oauth2_token) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.oauth2_token = oauth2_token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauth2_token() {
        return oauth2_token;
    }

    public void setOauth2_token(String oauth2_token) {
        this.oauth2_token = oauth2_token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                Objects.equals(name, user.name) &&
                email.equals(user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(oauth2_token, user.oauth2_token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, oauth2_token);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id.toString() +
                ", name='" + name + '\'' +
                '}';
    }

//    public JSON toJson() {
//
//    }


}


