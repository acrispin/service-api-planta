package com.unicon.api.planta.mapper;

import com.unicon.api.planta.beans.PlantaOptimaBean;
import com.unicon.api.planta.beans.PlantaOptimaFullBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface IPlantaMapper {

    List<PlantaOptimaFullBean> selectPlantaOptimaFull (
            @Param("idMarca") Integer idMarca,
            @Param("cuadrante") String cuadrante,
            @Param("lat") Double lat,
            @Param("lon") Double lon);

    List<PlantaOptimaBean> selectPlantaOptima (
            @Param("idMarca") Integer idMarca,
            @Param("detalles") ArrayList<PlantaOptimaFullBean> list);

}
