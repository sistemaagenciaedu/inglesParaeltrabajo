package com.ingles.examen.filters;




public class IngresanteFilterDto {

    private String nombre;
    private String numDoc;
    private String apellido;
    private String nacionalidad;
    private String genero;
    private String mail;
    private String pais;
    private String provincia;
    private String desde;
    private String hasta;
    private String encuenta;
    private String examen;
    private String order;



    public IngresanteFilterDto(String nombre, String numDoc, String apellido, String nacionalidad, String genero, String mail, String pais, String provincia, String desde, String hasta, String encuenta, String examen, String order) {
        this.nombre = nombre;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.mail = mail;
        this.pais = pais;
        this.provincia = provincia;
        this.desde = desde;
        this.hasta = hasta;
        this.encuenta = encuenta;
        this.examen = examen;
        this.order = order;
    }
    public boolean isASC(){
        return this.order.compareToIgnoreCase("ASC")==0;
    }
    public boolean isDESC(){
        return this.order.compareToIgnoreCase("DESC")==0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getEncuenta() {
        return encuenta;
    }

    public void setEncuenta(String encuenta) {
        this.encuenta = encuenta;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
