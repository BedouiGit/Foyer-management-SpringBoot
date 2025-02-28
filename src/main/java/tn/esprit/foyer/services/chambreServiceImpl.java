package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.models.Chambre;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;
@Service

public class chambreServiceImpl implements ChambreService{
    //type1
    private final ChambreRepository chambreRepository;

    public chambreServiceImpl(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    //type2
    //autowire
    //private ChambreRepository chambreRepository;
    @Override
    public Chambre saveChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre getChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }
}
