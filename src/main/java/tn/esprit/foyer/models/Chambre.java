package tn.esprit.foyer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    public long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }

    @Id
   private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    @JsonIgnore
    private Bloc bloc;

    @OneToMany
    @JsonIgnore
    private List<Reservation> reservations;



}
