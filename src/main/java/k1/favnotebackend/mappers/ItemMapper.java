package k1.favnotebackend.mappers;

import k1.favnotebackend.dto.ArticleDto;
import k1.favnotebackend.dto.ItemDto;
import k1.favnotebackend.dto.NoteDto;
import k1.favnotebackend.dto.TwitterDto;
import k1.favnotebackend.model.*;
import k1.favnotebackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ItemMapper {

    private UserRepository userRepository;

    @Autowired
    public ItemMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public <T extends Item> Item dtoToEntity(ItemDto item){

        User user = userRepository.findById(item.getUserId())
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.BAD_REQUEST, "User with that id does not exist!"));

        if (item instanceof ArticleDto) {
            return new Article(item.getTitle(), item.getContent(),
                    item.getCreated(), ((ArticleDto) item).getArticleUrl(), user);
        } else if (item instanceof TwitterDto) {
            return new Twitter(item.getTitle(), item.getContent(),
                    item.getCreated(), ((TwitterDto) item).getTwitterName(), user);
        } else {
            return new Note(item.getTitle(), item.getContent(), item.getCreated(), user);
        }
    }

    public <T extends ItemDto> ItemDto entityToDto(Item item){

        Long userId = item.getUser().getId();

        if(item instanceof Article){
            return new ArticleDto(item.getId(),item.getTitle(),item.getContent(),item.getCreated(),userId,
                    ((Article) item).getArticleUrl());
        }
        else if(item instanceof Twitter){
            return  new TwitterDto(item.getId(),item.getTitle(),item.getContent(),item.getCreated(),userId,
                    ((Twitter) item).getTwitterName());
        }
        else{
            return  new NoteDto(item.getId(),item.getTitle(),item.getContent(),item.getCreated(),userId);
        }
    }
}
