package tn.esprit.foyer.services;
import java.util.List;
import tn.esprit.foyer.models.Chambre;

public interface ChambreService {
    Chambre saveChambre(Chambre chambre);
    void deleteChambre(long idChambre);
    Chambre getChambre(long idChambre);
    List<Chambre> getAllChambres();

}
