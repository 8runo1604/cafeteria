package fca.cafeteria.data;

import fca.cafeteria.data.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CafeteriaRepository extends JpaRepository<Bebida,Integer> {
}