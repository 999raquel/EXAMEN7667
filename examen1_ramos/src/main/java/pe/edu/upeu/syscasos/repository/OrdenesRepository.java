package pe.edu.upeu.syscasos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscasos.entity.Ordenes;
@Repository

public interface OrdenesRepository extends JpaRepository<Ordenes, Long> {

}
