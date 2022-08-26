package com.ingles.examen.controller;

import com.ingles.examen.entity.Examen;
import com.ingles.examen.entity.Ingresante;
import com.ingles.examen.services.ExamenService;
import com.ingles.examen.services.IngresanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    private ExamenService es;
    @Autowired
    private IngresanteService is;





    @PostMapping("/save")
    public String save(Examen examen, Long id_ingresante, Model model) {
        Ingresante previo=is.findIngresanteById(id_ingresante);
        System.out.println(previo.getI_examen().toString());
        if (previo.getI_examen()==false) {
            Examen examenNew=new Examen();
            examenNew =es.evaluar(examen);
            examenNew.setId_ingresante(id_ingresante);
            examenNew=es.save(examenNew);
            previo.setExamen(examenNew);
            previo.setI_examen(true);
            is.saveIngresante(previo);
            model.addAttribute("usu", previo.getNombre()+" " +previo.getApellido());
            return "finalizado";
        }else{

            model.addAttribute("usu", previo.getNombre()+" " +previo.getApellido());
            return "finalizado";
        }

    }

    @GetMapping("/delete")
    public String delete(@RequestParam Long id, Model model) {
        Examen examen=es.findExamenById(id);
        es.delete(examen);
        model.addAttribute(examen);
        return "delete";

    }
}

