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
public class Twitter extends AbstractEntity {

    @NotNull
    private String twitterName;

    public Twitter(String title, String content, String twitterName, User user) {
        super(title, content, user);
        this.twitterName = twitterName;
    }

}
