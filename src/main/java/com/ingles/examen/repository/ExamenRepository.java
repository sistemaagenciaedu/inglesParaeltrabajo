package com.ingles.examen.repository;

import com.ingles.examen.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {

}
