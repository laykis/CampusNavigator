package WKU.CN.repository;

import WKU.CN.entity.Structures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructuresRepository extends JpaRepository<Structures, Long> {
}
