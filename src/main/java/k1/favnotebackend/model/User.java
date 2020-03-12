package k1.favnotebackend.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @OneToMany(mappedBy = "user")
    List<Note> notes = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<Article> articles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<Twitter> twitters = new ArrayList<>();


    public User() {
    }

    public User(@NotNull String username, @NotNull String password) {
        this.username = username;
        this.password = password;
    }

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

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Twitter> getTwitters() {
        return twitters;
    }

    public void setTwitters(List<Twitter> twitters) {
        this.twitters = twitters;
    }
}
