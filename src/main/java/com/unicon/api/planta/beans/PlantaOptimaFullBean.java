
package com.unicon.api.planta.beans;


import java.io.Serializable;

public class PlantaOptimaFullBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String coPta;
    private String origen;
    private String periodCode;
    private Double ptaLatitud;
    private Double ptaLongitud;
    private Integer rowNum;
    private Integer tiempo;

    public PlantaOptimaFullBean() {
    }

    @Override
    public String toString() {
        return "PlantaOptimaFullBean{" +
                "coPta='" + coPta + '\'' +
                ", origen='" + origen + '\'' +
                ", periodCode='" + periodCode + '\'' +
                ", ptaLatitud=" + ptaLatitud +
                ", ptaLongitud=" + ptaLongitud +
                ", rowNum=" + rowNum +
                ", tiempo=" + tiempo +
                '}';
    }

    public String getCoPta() {
        return coPta;
    }

    public void setCoPta(String coPta) {
        this.coPta = coPta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPeriodCode() {
        return periodCode;
    }

    public void setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
    }

    public Double getPtaLatitud() {
        return ptaLatitud;
    }

    public void setPtaLatitud(Double ptaLatitud) {
        this.ptaLatitud = ptaLatitud;
    }

    public Double getPtaLongitud() {
        return ptaLongitud;
    }

    public void setPtaLongitud(Double ptaLongitud) {
        this.ptaLongitud = ptaLongitud;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

}
