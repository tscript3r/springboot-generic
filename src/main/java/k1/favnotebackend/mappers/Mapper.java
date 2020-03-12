package k1.favnotebackend.mappers;

import k1.favnotebackend.dto.AbstractDto;
import k1.favnotebackend.model.AbstractEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mapper {

    private final ModelMapper modelMapper;

    public <E extends AbstractEntity, T extends AbstractDto> T map(E entity, Class<T> dto) {
        return modelMapper.map(entity, dto);
    }

    public <E extends AbstractEntity, T extends AbstractDto> E map(T dto, Class<E> entity) {
        return modelMapper.map(dto, entity);
    }

}
