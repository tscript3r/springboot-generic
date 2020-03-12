package k1.favnotebackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Article extends AbstractEntity {

    @NotNull
    private String articleUrl;

    public Article(String title, String content, String articleUrl, User user) {
        super(title, content, user);
        this.articleUrl = articleUrl;
    }

}

