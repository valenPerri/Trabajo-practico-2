package com.tp2;

public class Filtros {

    private String nombreFiltro;
    private String criterio;

    public Filtros(String nombreFiltro, String criterio) {
        this.nombreFiltro = nombreFiltro;
        this.criterio = criterio;
    }

    public Filtros(){
    }

    public String getNombreFiltro(){
        return nombreFiltro;
    }

    public String getCriterio(){
        return criterio;
    }

    public void setNombreFiltro(String nombreFiltro){
        this.nombreFiltro= nombreFiltro;
    }

    public void setCriterio(String criterio){
        this.criterio= criterio;
    }


}
