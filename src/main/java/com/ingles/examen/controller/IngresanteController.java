package com.ingles.examen.controller;

import com.ingles.examen.entity.Examen;
import com.ingles.examen.entity.Ingresante;
import com.ingles.examen.entity.Usuario;
import com.ingles.examen.repository.UsuarioRepository;
import com.ingles.examen.services.ExamenService;
import com.ingles.examen.services.IngresanteService;
import com.ingles.examen.utiles.Utiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

@RequestMapping("/ingresante")
public class IngresanteController {

    @Autowired
    private IngresanteService is;
    @Autowired
    private Utiles ut;
    @Autowired
    private ExamenService es;
    @Autowired
    private UsuarioRepository ur;

    @GetMapping("/consulta")
    public String subir() {

        return "buscaringresante";
    }

    @PostMapping("/traer")
    public String traerIngresante(@RequestParam String doc, Model model) {
        List<Usuario> listauser = ur.findAll();
        Boolean validador = false;
        if (listauser.size() == 0) {
            Ingresante busqueda = is.findIngresanteByDoc(doc);
            if (busqueda == null) {
                model.addAttribute("no", "*advertencia el dni ingresado no es valido");
                return "buscaringresante";
            } else if (busqueda.getD_estado() == false) {
                Ingresante ingre = is.findIngresanteByDoc(doc);
                model.addAttribute("listaBarriosCaba", ut.devolverBarriosCaba());
                model.addAttribute("listaDeLocalidadesGcba", ut.devolverLocalidades());
                model.addAttribute("listaProvincias", ut.devolverProvincias());
                model.addAttribute("listaPaises", ut.devolverPaises());
                model.addAttribute("ingresante", ingre);
                model.addAttribute("listaNacionalidades", ut.devolverNacionalidades());
                return "datosduros";
            } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == false && busqueda.getT_estado() == false) {
                model.addAttribute("ingresante", busqueda);
                model.addAttribute("listaNivelAlcanzado", ut.devolverNivelEstudios());
                model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
                model.addAttribute("listaActividades", ut.devolverActividadesPrincipales());
                model.addAttribute("listaRolIt", ut.devolverRolesIt());
                model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());

                return "encuentapersonal";
            } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true && busqueda.getT_estado() == true && busqueda.getI_estado() == false) {
                model.addAttribute("ingresante", busqueda);

                return "nivelingles";
            } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true
                    && busqueda.getT_estado() == true && busqueda.getI_estado() == true && busqueda.getExamen() == null) {
                model.addAttribute("ingresante", busqueda);
                return "examen-aviso";
            } else {
                model.addAttribute("usu", busqueda.getNombre() + " " + busqueda.getApellido());
                return "finalizado";
            }
        } else {
            for (Usuario usu : listauser) {
                if (usu.getEncuesta().equalsIgnoreCase("si")) {
                    validador = true;
                    break;
                } else {
                    validador = false;
                    break;
                }
            }
            if (validador) {
                Ingresante busqueda = is.findIngresanteByDoc(doc);
                if (busqueda == null) {
                    model.addAttribute("no", "*advertencia el dni ingresado no es válido");
                    return "buscaringresante";
                } else if (busqueda.getD_estado() == false) {
                    Ingresante ingre = is.findIngresanteByDoc(doc);
                    model.addAttribute("listaBarriosCaba", ut.devolverBarriosCaba());
                    model.addAttribute("listaDeLocalidadesGcba", ut.devolverLocalidades());
                    model.addAttribute("listaProvincias", ut.devolverProvincias());
                    model.addAttribute("listaPaises", ut.devolverPaises());
                    model.addAttribute("ingresante", ingre);
                    model.addAttribute("listaNacionalidades", ut.devolverNacionalidades());
                    return "datosduros";
                } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == false && busqueda.getT_estado() == false) {
                    model.addAttribute("ingresante", busqueda);
                    model.addAttribute("listaNivelAlcanzado", ut.devolverNivelEstudios());
                    model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
                    model.addAttribute("listaActividades", ut.devolverActividadesPrincipales());
                    model.addAttribute("listaRolIt", ut.devolverRolesIt());
                    model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());

                    return "encuentapersonal";
                } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true && busqueda.getT_estado() == true && busqueda.getI_estado() == false) {
                    model.addAttribute("ingresante", busqueda);

                    return "nivelingles";
                } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true
                        && busqueda.getT_estado() == true && busqueda.getI_estado() == true && busqueda.getExamen() == null) {
                    model.addAttribute("ingresante", busqueda);
                    return "examen-aviso";
                } else {
                    model.addAttribute("usu", busqueda.getNombre() + " " + busqueda.getApellido());
                    return "finalizado";
                }
            } else {
                return "finalizo-periodo";
            }
        }
    }

    @PostMapping("/duros")
    public String saveDuros(Ingresante ingresante, Model model) {
        Ingresante modificado = is.guardarDDuros(ingresante);
        is.saveIngresante(modificado);
        model.addAttribute("ingresante", modificado);
        model.addAttribute("listaNivelAlcanzado", ut.devolverNivelEstudios());
        model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
        model.addAttribute("listaActividades", ut.devolverActividadesPrincipales());
        model.addAttribute("listaRolIt", ut.devolverRolesIt());
        model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());

        return "encuentapersonal";
    }

    @PostMapping("/encuenta")
    public String saveEncuenta(Ingresante ingresante, Model model) {
        Ingresante modificado = is.guardarEncuenta(ingresante);
        is.saveIngresante(modificado);

        model.addAttribute("ingresante", modificado);

        return "nivelingles";
    }

    @PostMapping("/nivel")
    public String saveNivel(Ingresante ingresante, Model model, String i_uso_t_situacion_otro, String i_donde_otro) {
        System.out.println("el lugar es :" + i_donde_otro);
        System.out.println("La situaion es :" + i_uso_t_situacion_otro);
        Ingresante modificado = is.guardarNivel(ingresante, i_uso_t_situacion_otro, i_donde_otro);

        modificado = is.saveIngresante(modificado);

        model.addAttribute("ingresante", modificado);

        return "examen-aviso";
    }

    @PostMapping("/realizar-examen")
    public String saveNivel(Ingresante ingresante, Model model) {
        Ingresante ingre = is.findIngresanteById(ingresante.getId());
        System.out.println("El examen esssssss " + ingre.getI_examen());
        if (ingre.getI_examen() == false) {
            Examen exa = new Examen();
            exa.setApellido(ingre.getApellido());
            exa.setNombre(ingre.getNombre());
            exa.setNumDoc(ingre.getNumDoc());
            exa.setId_ingresante(ingre.getId());
            ingre.setExamen(es.save(exa));
            ingre = is.saveIngresante(ingre);
            model.addAttribute("examen", ingre.getExamen());
            return "new_examen";
        } else {
            model.addAttribute("usu", ingre.getNombre() + " " + ingre.getApellido());
            return "finalizado";

        }

    }

}
