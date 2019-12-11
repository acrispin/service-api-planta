package com.unicon.api.planta.service;

import com.unicon.api.planta.beans.PlantaOptimaBean;
import com.unicon.api.planta.dao.PlantaDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantaService implements IPlantaService {

    @Override
    public List<PlantaOptimaBean> obtenerPlantasOptimas(
            Integer idMarca,
            String cuadrante,
            Double lat,
            Double lon) {
        return new PlantaDao().selectPlantaOptima(idMarca, cuadrante, lat, lon);
    }
}
