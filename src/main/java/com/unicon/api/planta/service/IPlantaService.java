package com.unicon.api.planta.service;

import com.unicon.api.planta.beans.PlantaOptimaBean;

import java.util.List;

public interface IPlantaService {

    List<PlantaOptimaBean> obtenerPlantasOptimas(Integer idMarca,
                                                 String cuadrante,
                                                 Double lat,
                                                 Double lon);

}
