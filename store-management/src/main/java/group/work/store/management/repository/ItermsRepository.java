package group.work.store.management.repository;

import group.work.store.management.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItermsRepository extends JpaRepository<Items, Integer> {
}
