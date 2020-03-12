package k1.favnotebackend.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String content;

    @CreationTimestamp
    private Date created;

    @ManyToOne
    private User user;

    public AbstractEntity() {
    }

    public AbstractEntity(@NotNull String title, @NotNull String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

}
