package tn.esprit.foyer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.models.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
