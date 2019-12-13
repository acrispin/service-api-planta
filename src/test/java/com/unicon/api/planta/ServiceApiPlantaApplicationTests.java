package com.unicon.api.planta;

import com.unicon.api.planta.dao.PlantaDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServiceApiPlantaApplicationTests {

	@Test
	void contextLoads() {
		// List<PlantaOptimaFullBean> lista1 = new PlantaDao().selectPlantaOptimaFull(1, "", -12.0833496, -77.0386732);
		List<PlantaOptimaBean> lista2 = new PlantaDao().selectPlantaOptima(1, "", -12.0833496, -77.0386732);
	}

}
