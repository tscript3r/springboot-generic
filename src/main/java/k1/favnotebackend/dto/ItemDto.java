package k1.favnotebackend.dto;

import k1.favnotebackend.model.User;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

public abstract class ItemDto {

    private Long id;

    private String title;

    private String content;

    private Date created;

    private Long userId;

    public ItemDto(Long id, String title, String content, Date created, Long userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created = created;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreated() {
        return created;
    }

    public Long getUserId() {
        return userId;
    }
}
