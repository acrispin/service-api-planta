package com.unicon.api.planta.service;

import com.unicon.api.commons.beans.planta.PlantaOptimaBean;

import java.util.List;

public interface IPlantaService {

    List<PlantaOptimaBean> obtenerPlantasOptimas(Integer idMarca,
                                                 String cuadrante,
                                                 Double lat,
                                                 Double lon);

}
