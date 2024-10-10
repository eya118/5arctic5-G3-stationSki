package tn.esprit.stationski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Piste;
import tn.esprit.stationski.entities.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    List<Skieur> findByPistesNumPiste(long numPiste);
}
