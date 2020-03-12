package k1.favnotebackend.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Article extends Item{

    @NotNull
    private String articleUrl;

    public Article(){

    }

    public Article(String title, String content, Date created, String articleUrl, User user) {
        super(title,content,created, user);
        this.articleUrl = articleUrl;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }
}

