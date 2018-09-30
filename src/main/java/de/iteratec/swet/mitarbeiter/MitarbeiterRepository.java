package de.iteratec.swet.mitarbeiter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Long> {

    @Query("SELECT m FROM Mitarbeiter m WHERE m.kuerzel=(:kuerzel)")
    Mitarbeiter findByKuerzel(@Param("kuerzel") String kuerzel);
}
