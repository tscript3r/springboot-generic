package k1.favnotebackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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

    public User(@NotNull String username, @NotNull String password) {
        this.username = username;
        this.password = password;
    }

}
