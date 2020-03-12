package k1.favnotebackend.services;

import k1.favnotebackend.dto.TwitterDto;
import k1.favnotebackend.mappers.Mapper;
import k1.favnotebackend.model.Twitter;
import k1.favnotebackend.repositories.TwitterRepository;
import org.springframework.stereotype.Service;

@Service
public class TwitterService extends AbstractService<Twitter, TwitterDto> {

    public TwitterService(TwitterRepository itemRepository, Mapper mapper) {
        super(itemRepository, mapper, Twitter.class, TwitterDto.class);
    }

}
