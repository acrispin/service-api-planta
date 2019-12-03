package com.unicon.api.serviceapiplanta.controller;

import com.unicon.api.serviceapiplanta.beans.PlantaOptimaBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/planta-optima")
public class PlantaController {

    private static Logger log = LoggerFactory.getLogger(PlantaController.class);

    @GetMapping("")
    public List<PlantaOptimaBean> getPlantaOptimas(
            @RequestParam(defaultValue = "0") int idMarca,
            @RequestParam(defaultValue = "0") Double lat,
            @RequestParam(defaultValue = "0") Double lon,
            @RequestParam(defaultValue = "") String cuadrante
    ) {
        log.info("getPlantaOptimas idMarca: " + idMarca);
        log.info("getPlantaOptimas lat: " + lat);
        log.info("getPlantaOptimas lon: " + lon);
        log.info("getPlantaOptimas cuadrante: " + cuadrante);
        List<PlantaOptimaBean> lista = new ArrayList<>();
        lista.add(new PlantaOptimaBean("SJN","SAN JUAN","00:00:00 a 05:59:00",26));
        lista.add(new PlantaOptimaBean("MAT","MATERIALES","06:00:00 a 06:59:00",39));
        lista.add(new PlantaOptimaBean("AL2","ANCIETA 2 L2","07:00:00 a 08:59:00",54));
        lista.add(new PlantaOptimaBean("SJN","SAN JUAN","09:00:00 a 16:59:00",44));
        return lista;
    }

}
