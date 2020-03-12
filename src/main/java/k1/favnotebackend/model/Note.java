package k1.favnotebackend.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Note extends Item {


    public Note(){

    }

    public Note(String title, String content, Date created, User user) {
        super(title,content,created, user);
    }
}
