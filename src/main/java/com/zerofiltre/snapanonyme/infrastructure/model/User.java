package com.zerofiltre.snapanonyme.infrastructure.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User extends SuperClazz {

    private String userName;
    private String password;
    private String role;

    @OneToMany
    private List<Article> articles;

    public User(int id, String userName, String password, String role, List<Article> articles) {
        super(id);
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.articles = articles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
