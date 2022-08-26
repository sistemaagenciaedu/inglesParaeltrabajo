package com.ingles.examen.services;

import com.ingles.examen.entity.Examen;

import java.util.List;

public interface ExamenService {
    public Examen createExamen(Examen examen);
    public List<Examen> findAllExamen();
    public Examen save(Examen examen);
    public void delete(Examen examen);
    public Examen findExamen(Examen examen);
    public Examen findExamenById(Long id);
    public Examen evaluar(Examen examen);
}