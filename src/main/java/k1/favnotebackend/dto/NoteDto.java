package k1.favnotebackend.dto;

public class NoteDto extends AbstractDto {

    public NoteDto(Long id, String title, String content, Long userId) {
        super(id, title, content, userId);
    }

}
