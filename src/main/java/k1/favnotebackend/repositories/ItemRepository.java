package k1.favnotebackend.repositories;

import k1.favnotebackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository<T extends Item> extends JpaRepository<T, Long> {
}
