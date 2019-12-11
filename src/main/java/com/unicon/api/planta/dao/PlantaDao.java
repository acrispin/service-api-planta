package com.unicon.api.planta.dao;

import com.unicon.api.commons.db.dao.DaoApplication;
import com.unicon.api.commons.db.dao.enums.EConnectionType;
import com.unicon.api.planta.beans.PlantaOptimaBean;
import com.unicon.api.planta.beans.PlantaOptimaFullBean;
import com.unicon.api.planta.mapper.IPlantaMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author acrispin
 */
@Log4j2
public class PlantaDao extends DaoApplication<PlantaOptimaBean, IPlantaMapper> {

    @Override
    protected Class<PlantaOptimaBean> getClassType() {
        return PlantaOptimaBean.class;
    }

    @Override
    protected Logger getLogger() {
        return log;
    }

    @Override
    protected EConnectionType getConnectionType() {
        return EConnectionType.SINGLE;
    }

    @Override
    protected Class<IPlantaMapper> getMapperType() {
        return IPlantaMapper.class;
    }

    /**
     *
     * @param idMarca
     * @param lat
     * @param lon
     * @param cuadrante
     * @return
     */
    public List<PlantaOptimaFullBean> selectPlantaOptimaFull(
            Integer idMarca,
            String cuadrante,
            Double lat,
            Double lon) {
        return queryList("selectPlantaOptimaFull", idMarca, cuadrante, lat, lon);
    }

    public List<PlantaOptimaBean> selectPlantaOptima(Integer idMarca,
                                                     String cuadrante,
                                                     Double lat,
                                                     Double lon) {
        List<PlantaOptimaBean> listaResponse;
        List<PlantaOptimaFullBean> lista = selectPlantaOptimaFull(idMarca, cuadrante, lat, lon);
        if (lista != null) {
            lista = lista.stream().filter(p -> p.getRowNum() == 1).collect(Collectors.toList());
            listaResponse = queryList("selectPlantaOptima", idMarca, lista);
        } else {
            listaResponse = new ArrayList<>();
        }

        return listaResponse;
    }
}
