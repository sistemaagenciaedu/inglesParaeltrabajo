package com.ingles.examen.entity;



import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean estado;
    private String permisos="ROLE_ADMIN";
    private String clave;
    private String encuesta="si";
    private String username;
    @Temporal(TemporalType.DATE)
    private Date alta=new Date();


    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String email, Boolean estado, String permisos, String clave, String encuesta, String username, Date alta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
        this.permisos = permisos;
        this.clave = clave;
        this.encuesta = encuesta;
        this.username = username;
        this.alta = alta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(String encuesta) {
        this.encuesta = encuesta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                ", permisos='" + permisos + '\'' +
                ", clave='" + clave + '\'' +
                ", encuesta='" + encuesta + '\'' +
                ", username='" + username + '\'' +
                ", alta=" + alta +
                '}';
    }
}
