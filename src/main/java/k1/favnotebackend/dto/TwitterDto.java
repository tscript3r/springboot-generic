package k1.favnotebackend.dto;

import java.util.Date;

public class TwitterDto extends ItemDto {

    public String getTwitterName() {
        return twitterName;
    }

    private String twitterName;

    public TwitterDto(Long id, String title, String content, Date created, Long userId, String twitterName1) {
        super(id, title, content, created, userId);
        this.twitterName = twitterName1;
    }
}
