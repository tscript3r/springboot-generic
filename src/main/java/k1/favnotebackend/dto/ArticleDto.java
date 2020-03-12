package k1.favnotebackend.dto;

import lombok.Getter;

@Getter
public class ArticleDto extends AbstractDto {

    private String articleUrl;

    public ArticleDto(Long id, String title, String content, Long userId, String articleUrl) {
        super(id, title, content, userId);
        this.articleUrl = articleUrl;
    }

}
