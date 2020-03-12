package k1.favnotebackend.dto;


import java.util.Date;

public class NoteDto extends ItemDto {

    public NoteDto(Long id, String title, String content, Date created, Long userId) {
        super(id, title, content, created, userId);
    }
}
