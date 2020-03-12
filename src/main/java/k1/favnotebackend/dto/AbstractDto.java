package k1.favnotebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractDto {

    private Long id;

    private String title;

    private String content;

    private Long userId;

}