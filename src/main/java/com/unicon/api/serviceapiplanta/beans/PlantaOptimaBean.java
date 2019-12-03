package com.unicon.api.serviceapiplanta.beans;

import java.io.Serializable;

public class PlantaOptimaBean {

    private static final long serialVersionUID = 1L;

    protected String codigoPlanta;
    protected String descripcionPlanta;
    protected String periodo;
    protected Integer tiempo;

    public PlantaOptimaBean() {
    }

    public PlantaOptimaBean(String codigoPlanta, String descripcionPlanta, String periodo, Integer tiempo) {
        this.codigoPlanta = codigoPlanta;
        this.descripcionPlanta = descripcionPlanta;
        this.periodo = periodo;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "PlantaOptimaBean{" +
                "codigoPlanta='" + codigoPlanta + '\'' +
                ", descripcionPlanta='" + descripcionPlanta + '\'' +
                ", periodo='" + periodo + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }

    public String getCodigoPlanta() {
        return codigoPlanta;
    }

    public void setCodigoPlanta(String codigoPlanta) {
        this.codigoPlanta = codigoPlanta;
    }

    public String getDescripcionPlanta() {
        return descripcionPlanta;
    }

    public void setDescripcionPlanta(String descripcionPlanta) {
        this.descripcionPlanta = descripcionPlanta;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
}
