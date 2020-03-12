package k1.favnotebackend.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Twitter extends Item{

    @NotNull
    private String twitterName;


    public Twitter(){

    }

    public Twitter(String title, String content, Date created, String twitterName, User user) {
        super(title,content,created, user);
        this.twitterName = twitterName;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }
}
