package tn.esprit.foyer.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.models.Chambre;
import tn.esprit.foyer.services.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")


public class chambreController {
    private final ChambreService chambreService;

    public chambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @PostMapping("/ajouterchambre")
    public Chambre createChambre (@RequestBody Chambre chambre) {
        return chambreService.saveChambre(chambre);
    }

    @DeleteMapping("/deletechambre/{id}")
    public void deletechambre (@PathVariable long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/getbyid/{id}")
    public Chambre getChambreById(@PathVariable long id) {
        return chambreService.getChambre(id);
    }

    @GetMapping ("/getall")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @PutMapping("/updateChambre/{id}")
    public Chambre updateChambre (@PathVariable Long id, @RequestBody Chambre chambre) {
        chambre.setIdChambre(id);
        return chambreService.saveChambre(chambre);
    }

}

