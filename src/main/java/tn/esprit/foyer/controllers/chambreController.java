package tn.esprit.foyer.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.models.Chambre;
import tn.esprit.foyer.services.ChambreService;

import java.util.List;
@Tag(name = "Gestion Chambre")
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
    @Operation(description = "récupérer toutes les chambres de la base de données")
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

