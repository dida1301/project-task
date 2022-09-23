package group.work.store.management.repository;

import group.work.store.management.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store,Integer> {
}
