package com.ingles.examen.entity;



import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "ingresante")
public class Ingresante {

    /**
     * **************Datos Duros********************************
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mail;
    private Long celu;
    private String tDoc;
    private String numDoc;
    private String apellido;
    private String nombre;
    private String fNacimiento;
    private String genero;
    private String nacionalidad;
    private String pais;
    private String provincia;
    private String localidadResi;
    private String domicilio;
    private Boolean d_estado=false;
    /**
     * **************Tayectoria Educativa********************************
     */
    private String e_nivelMaximo;
    private String e_egresadoDe;
    private String e_establecimiento;
    private Integer e_anioEgreso;
    private Boolean e_estado=false;
    /**
     * **************Situacion Laboral********************************
     */
    private String t_situacionActual;
    private String t_relacion;
    private String t_actividadPrincipal;
    private String t_roles;
    private String t_duracion;
    private Integer t_antiguedad;
    private Integer t_aniosDelSector;
    private String t_estudiosSector;
    private String t_aportesJ;
    private String t_plataPara;
    private String t_horas;
    private String t_franja;
    private Boolean t_estado=false;

    /**
     * **************nivel Ingles********************************
     */
    private String i_estudiaste;
    private String i_donde;
    private String i_nivel_oral;
    private String i_nivel_escrito;
    private String i_nivel_lectura;
    private String i_uso_trabajo;
    private String i_uso_t_situacion;
    private String i_conseguirOportunidades;
    private String i_programacion;
    private String i_cercerProfecionalmente;
    private String i_valorTiempo;
    private Boolean i_estado=false;
    private Boolean i_examen=false;
    @Temporal(TemporalType.DATE)
    private Date fechaEncuenta;
    /**
     * **************test********************************
     */
    @OneToOne

    private Examen examen;

    public Ingresante() {
    }

    public Ingresante(Long id, String mail, String numDoc, String apellido, String nombre, String e_egresadoDe, String e_establecimiento) {
        this.id = id;
        this.mail = mail;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nombre = nombre;
        this.e_egresadoDe = e_egresadoDe;
        this.e_establecimiento = e_establecimiento;
    }

    public Ingresante(Long id, String mail, Long celu, String tDoc, String numDoc, String apellido, String nombre, String fNacimiento, String genero, String nacionalidad, String pais, String provincia, String localidadResi, String domicilio, String e_nivelMaximo, String e_egresadoDe, String e_establecimiento, Integer e_anioEgreso, String t_situacionActual, String t_relacion, String t_actividadPrincipal, String t_roles, String t_duracion, Integer t_antiguedad, Integer t_aniosDelSector, String t_aportesJ, String t_plataPara, String t_horas, String t_franja, String i_estudiaste, String i_donde, String i_nivel_oral, String i_nivel_escrito, String i_nivel_lectura, String i_uso_trabajo, String i_uso_t_situacion, String i_conseguirOportunidades, String i_programacion, String i_cercerProfecionalmente, String i_valorTiempo, Examen examen) {
        this.id = id;
        this.mail = mail;
        this.celu = celu;
        this.tDoc = tDoc;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.pais = pais;
        this.provincia = provincia;
        this.localidadResi = localidadResi;
        this.domicilio = domicilio;
        this.e_nivelMaximo = e_nivelMaximo;
        this.e_egresadoDe = e_egresadoDe;
        this.e_establecimiento = e_establecimiento;
        this.e_anioEgreso = e_anioEgreso;
        this.t_situacionActual = t_situacionActual;
        this.t_relacion = t_relacion;
        this.t_actividadPrincipal = t_actividadPrincipal;
        this.t_roles = t_roles;
        this.t_duracion = t_duracion;
        this.t_antiguedad = t_antiguedad;
        this.t_aniosDelSector = t_aniosDelSector;
        this.t_aportesJ = t_aportesJ;
        this.t_plataPara = t_plataPara;
        this.t_horas = t_horas;
        this.t_franja = t_franja;
        this.i_estudiaste = i_estudiaste;
        this.i_donde = i_donde;
        this.i_nivel_oral = i_nivel_oral;
        this.i_nivel_escrito = i_nivel_escrito;
        this.i_nivel_lectura = i_nivel_lectura;
        this.i_uso_trabajo = i_uso_trabajo;
        this.i_uso_t_situacion = i_uso_t_situacion;
        this.i_conseguirOportunidades = i_conseguirOportunidades;
        this.i_programacion = i_programacion;
        this.i_cercerProfecionalmente = i_cercerProfecionalmente;
        this.i_valorTiempo = i_valorTiempo;
        this.examen = examen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getCelu() {
        return celu;
    }

    public void setCelu(Long celu) {
        this.celu = celu;
    }

    public String gettDoc() {
        return tDoc;
    }

    public void settDoc(String tDoc) {
        this.tDoc = tDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidadResi() {
        return localidadResi;
    }

    public void setLocalidadResi(String localidadResi) {
        this.localidadResi = localidadResi;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Boolean getD_estado() {
        return d_estado;
    }

    public void setD_estado(Boolean d_estado) {
        this.d_estado = d_estado;
    }

    public String getE_nivelMaximo() {
        return e_nivelMaximo;
    }

    public void setE_nivelMaximo(String e_nivelMaximo) {
        this.e_nivelMaximo = e_nivelMaximo;
    }

    public String getE_egresadoDe() {
        return e_egresadoDe;
    }

    public void setE_egresadoDe(String e_egresadoDe) {
        this.e_egresadoDe = e_egresadoDe;
    }

    public String getE_establecimiento() {
        return e_establecimiento;
    }

    public void setE_establecimiento(String e_establecimiento) {
        this.e_establecimiento = e_establecimiento;
    }

    public Integer getE_anioEgreso() {
        return e_anioEgreso;
    }

    public void setE_anioEgreso(Integer e_anioEgreso) {
        this.e_anioEgreso = e_anioEgreso;
    }

    public Boolean getE_estado() {
        return e_estado;
    }

    public void setE_estado(Boolean e_estado) {
        this.e_estado = e_estado;
    }

    public String getT_situacionActual() {
        return t_situacionActual;
    }

    public void setT_situacionActual(String t_situacionActual) {
        this.t_situacionActual = t_situacionActual;
    }

    public String getT_relacion() {
        return t_relacion;
    }

    public void setT_relacion(String t_relacion) {
        this.t_relacion = t_relacion;
    }

    public String getT_actividadPrincipal() {
        return t_actividadPrincipal;
    }

    public void setT_actividadPrincipal(String t_actividadPrincipal) {
        this.t_actividadPrincipal = t_actividadPrincipal;
    }

    public String getT_roles() {
        return t_roles;
    }

    public void setT_roles(String t_roles) {
        this.t_roles = t_roles;
    }

    public String getT_duracion() {
        return t_duracion;
    }

    public void setT_duracion(String t_duracion) {
        this.t_duracion = t_duracion;
    }

    public Integer getT_antiguedad() {
        return t_antiguedad;
    }

    public void setT_antiguedad(Integer t_antiguedad) {
        this.t_antiguedad = t_antiguedad;
    }

    public Integer getT_aniosDelSector() {
        return t_aniosDelSector;
    }

    public void setT_aniosDelSector(Integer t_aniosDelSector) {
        this.t_aniosDelSector = t_aniosDelSector;
    }

    public String getT_estudiosSector() {
        return t_estudiosSector;
    }

    public void setT_estudiosSector(String t_estudiosSector) {
        this.t_estudiosSector = t_estudiosSector;
    }

    public String getT_aportesJ() {
        return t_aportesJ;
    }

    public void setT_aportesJ(String t_aportesJ) {
        this.t_aportesJ = t_aportesJ;
    }

    public String getT_plataPara() {
        return t_plataPara;
    }

    public void setT_plataPara(String t_plataPara) {
        this.t_plataPara = t_plataPara;
    }

    public String getT_horas() {
        return t_horas;
    }

    public void setT_horas(String t_horas) {
        this.t_horas = t_horas;
    }

    public String getT_franja() {
        return t_franja;
    }

    public void setT_franja(String t_franja) {
        this.t_franja = t_franja;
    }

    public Boolean getT_estado() {
        return t_estado;
    }

    public void setT_estado(Boolean t_estado) {
        this.t_estado = t_estado;
    }

    public String getI_estudiaste() {
        return i_estudiaste;
    }

    public void setI_estudiaste(String i_estudiaste) {
        this.i_estudiaste = i_estudiaste;
    }

    public String getI_donde() {
        return i_donde;
    }

    public void setI_donde(String i_donde) {
        this.i_donde = i_donde;
    }

    public String getI_nivel_oral() {
        return i_nivel_oral;
    }

    public void setI_nivel_oral(String i_nivel_oral) {
        this.i_nivel_oral = i_nivel_oral;
    }

    public String getI_nivel_escrito() {
        return i_nivel_escrito;
    }

    public void setI_nivel_escrito(String i_nivel_escrito) {
        this.i_nivel_escrito = i_nivel_escrito;
    }

    public String getI_nivel_lectura() {
        return i_nivel_lectura;
    }

    public void setI_nivel_lectura(String i_nivel_lectura) {
        this.i_nivel_lectura = i_nivel_lectura;
    }

    public String getI_uso_trabajo() {
        return i_uso_trabajo;
    }

    public void setI_uso_trabajo(String i_uso_trabajo) {
        this.i_uso_trabajo = i_uso_trabajo;
    }

    public String getI_uso_t_situacion() {
        return i_uso_t_situacion;
    }

    public void setI_uso_t_situacion(String i_uso_t_situacion) {
        this.i_uso_t_situacion = i_uso_t_situacion;
    }

    public String getI_conseguirOportunidades() {
        return i_conseguirOportunidades;
    }

    public void setI_conseguirOportunidades(String i_conseguirOportunidades) {
        this.i_conseguirOportunidades = i_conseguirOportunidades;
    }

    public String getI_programacion() {
        return i_programacion;
    }

    public void setI_programacion(String i_programacion) {
        this.i_programacion = i_programacion;
    }

    public String getI_cercerProfecionalmente() {
        return i_cercerProfecionalmente;
    }

    public void setI_cercerProfecionalmente(String i_cercerProfecionalmente) {
        this.i_cercerProfecionalmente = i_cercerProfecionalmente;
    }

    public String getI_valorTiempo() {
        return i_valorTiempo;
    }

    public void setI_valorTiempo(String i_valorTiempo) {
        this.i_valorTiempo = i_valorTiempo;
    }

    public Boolean getI_estado() {
        return i_estado;
    }

    public void setI_estado(Boolean i_estado) {
        this.i_estado = i_estado;
    }

    public Boolean getI_examen() {
        return i_examen;
    }

    public void setI_examen(Boolean i_examen) {
        this.i_examen = i_examen;
    }

    public Date getFechaEncuenta() {
        return fechaEncuenta;
    }

    public void setFechaEncuenta(Date fechaEncuenta) {
        this.fechaEncuenta = fechaEncuenta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    @Override
    public String toString() {
        return "Ingresante{" + "id=" + id + ", mail=" + mail + ", celu=" + celu + ", tDoc=" + tDoc + ", numDoc=" + numDoc + ", apellido=" + apellido + ", nombre=" + nombre + ", fNacimiento=" + fNacimiento + ", genero=" + genero + ", nacionalidad=" + nacionalidad + ", pais=" + pais + ", provincia=" + provincia + ", localidadResi=" + localidadResi + ", domicilio=" + domicilio + ", d_estado=" + d_estado + ", e_nivelMaximo=" + e_nivelMaximo + ", e_egresadoDe=" + e_egresadoDe + ", e_establecimiento=" + e_establecimiento + ", e_anioEgreso=" + e_anioEgreso + ", e_estado=" + e_estado + ", t_situacionActual=" + t_situacionActual + ", t_relacion=" + t_relacion + ", t_actividadPrincipal=" + t_actividadPrincipal + ", t_roles=" + t_roles + ", t_duracion=" + t_duracion + ", t_antiguedad=" + t_antiguedad + ", t_aniosDelSector=" + t_aniosDelSector + ", t_estudiosSector=" + t_estudiosSector + ", t_aportesJ=" + t_aportesJ + ", t_plataPara=" + t_plataPara + ", t_horas=" + t_horas + ", t_franja=" + t_franja + ", t_estado=" + t_estado + ", i_estudiaste=" + i_estudiaste + ", i_donde=" + i_donde + ", i_nivel_oral=" + i_nivel_oral + ", i_nivel_escrito=" + i_nivel_escrito + ", i_nivel_lectura=" + i_nivel_lectura + ", i_uso_trabajo=" + i_uso_trabajo + ", i_uso_t_situacion=" + i_uso_t_situacion + ", i_conseguirOportunidades=" + i_conseguirOportunidades + ", i_programacion=" + i_programacion + ", i_cercerProfecionalmente=" + i_cercerProfecionalmente + ", i_valorTiempo=" + i_valorTiempo + ", i_estado=" + i_estado + ", fechaEncuenta=" + fechaEncuenta + ", examen=" + examen + '}';
    }








}
