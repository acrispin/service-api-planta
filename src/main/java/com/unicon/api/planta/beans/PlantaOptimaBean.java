package com.unicon.api.planta.beans;

import java.io.Serializable;

public class PlantaOptimaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String codigoPlanta;
    // protected String descripcionPlanta;
    protected String periodo;
    protected Integer tiempo;

    public PlantaOptimaBean() {
    }

    public PlantaOptimaBean(String codigoPlanta, String periodo, Integer tiempo) {
        this.codigoPlanta = codigoPlanta;
        this.periodo = periodo;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "PlantaOptimaBean{" +
                "codigoPlanta='" + codigoPlanta + '\'' +
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
