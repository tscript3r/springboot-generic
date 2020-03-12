package k1.favnotebackend.dto;

import lombok.Getter;

@Getter
public class TwitterDto extends AbstractDto {

    private String twitterName;

    public TwitterDto(Long id, String title, String content, Long userId, String twitterName) {
        super(id, title, content, userId);
        this.twitterName = twitterName;
    }

}