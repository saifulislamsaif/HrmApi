package repository;

import entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HoilydayRepository extends JpaRepository<Holiday ,Long>, JpaSpecificationExecutor<Holiday> {
}
