package de.iteratec.swet.laufbahnstufen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LaufbahnstufeRepository extends JpaRepository<Laufbahnstufe, Long> {

    @Query("SELECT l FROM Laufbahnstufe l WHERE l.name=(:name)")
    Laufbahnstufe findByName(@Param("name") String name);
}
