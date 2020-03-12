package k1.favnotebackend.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Note extends AbstractEntity {

    public Note(String title, String content, User user) {
        super(title, content, user);
    }

}
