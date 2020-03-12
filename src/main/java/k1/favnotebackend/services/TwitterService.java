package k1.favnotebackend.services;

import k1.favnotebackend.dto.TwitterDto;
import k1.favnotebackend.mappers.Mapper;
import k1.favnotebackend.model.Twitter;
import k1.favnotebackend.repositories.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class TwitterService extends AbstractService<Twitter, TwitterDto> {

    public TwitterService(ItemRepository<Twitter> itemRepository, Mapper mapper) {
        super(itemRepository, mapper, Twitter.class, TwitterDto.class);
    }

}
