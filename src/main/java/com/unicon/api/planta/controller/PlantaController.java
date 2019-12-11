package com.unicon.api.planta.controller;

import com.unicon.api.planta.beans.PlantaOptimaBean;
import com.unicon.api.planta.service.IPlantaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planta-optima")
public class PlantaController {

    private static Logger log = LoggerFactory.getLogger(PlantaController.class);

    @Autowired
    public IPlantaService plantaService;

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
        return plantaService.obtenerPlantasOptimas(idMarca, cuadrante, lat, lon);
    }

}
