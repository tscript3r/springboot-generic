package k1.favnotebackend.services;

import k1.favnotebackend.dto.AbstractDto;
import k1.favnotebackend.mappers.Mapper;
import k1.favnotebackend.model.AbstractEntity;
import k1.favnotebackend.repositories.ItemRepository;

import java.util.List;
import java.util.stream.Collectors;

abstract class AbstractService<E extends AbstractEntity, T extends AbstractDto> {

    protected final ItemRepository<E> itemRepository;
    private final Mapper mapper;
    private final Class<E> entityType;
    private final Class<T> dtoType;

    public AbstractService(ItemRepository<E> itemRepository, Mapper mapper, Class<E> entityType, Class<T> dtoType) {
        this.itemRepository = itemRepository;
        this.mapper = mapper;
        this.entityType = entityType;
        this.dtoType = dtoType;
    }

    public List<? extends AbstractDto> getAllEntities() {
        return itemRepository.findAll()
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    protected E map(T o) {
        return mapper.map(o, entityType);
    }

    protected T map(E o) {
        return mapper.map(o, dtoType);
    }

}