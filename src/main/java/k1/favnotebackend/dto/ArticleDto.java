package k1.favnotebackend.dto;

import java.util.Date;

public class ArticleDto extends ItemDto {

    private String articleUrl;

    public ArticleDto(Long id, String title, String content, Date created, Long userId, String articleUrl) {
        super(id, title, content, created, userId);
        this.articleUrl = articleUrl;
    }

    public String getArticleUrl() {
        return articleUrl;
    }
}
