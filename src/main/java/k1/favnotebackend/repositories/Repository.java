package k1.favnotebackend.repositories;

import k1.favnotebackend.model.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
