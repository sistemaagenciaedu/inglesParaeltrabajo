package com.ingles.examen.controller;

import com.ingles.examen.entity.Usuario;
import com.ingles.examen.repository.UsuarioRepository;
import com.ingles.examen.utiles.EncriptarPassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller

@RequestMapping("")
public class HomeController {

    @Autowired
    private UsuarioRepository ur;

    @GetMapping({"", "/index", "/home", "/"})
    public String home() {

        return "buscaringresante";
    }

    @GetMapping("/administrador/crear-super-user")
    public String superUser() {

        List<Usuario> userLis = new ArrayList<>();
        userLis = ur.findAll();
        if (userLis.size() == 0) {
            Usuario usu = new Usuario();
            usu.setAlta(new Date());
            usu.setApellido("SuperAdmin");
            usu.setNombre("Admin");
            usu.setEmail("superadmin@bue.edu.ar");
            usu.setUsername(usu.getEmail());
            usu.setClave(EncriptarPassword.encriptarPassword("sistemas"));
            ur.save(usu);

        }
        return "buscaringresante";
    }

    /*,@RequestParam("query") String query,String desde, String hasta,String genero,String encuenta,String examen*/
//    @GetMapping("/listar")
//    public String listarIngresantes(List<ingresante>) {
////
//        model.addAttribute("ingre", ir.findAll());
//        model.addAttribute("cantidadRegistros", ir.findAll().size());
//
//        return "listareingresantes";
//    }
//
}
