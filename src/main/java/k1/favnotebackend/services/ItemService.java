package k1.favnotebackend.services;

import k1.favnotebackend.dto.ItemDto;
import k1.favnotebackend.mappers.ItemMapper;
import k1.favnotebackend.model.Item;
import k1.favnotebackend.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService<T extends Item> {

    private ItemRepository<T> itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemRepository<T> itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public List<? extends ItemDto> getAllItem(){
        return itemRepository.findAll()
                .stream()
                .map(item -> itemMapper.entityToDto(item))
                .collect(Collectors.toList());
    }
}
