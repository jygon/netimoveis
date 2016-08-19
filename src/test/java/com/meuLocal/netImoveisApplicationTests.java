package com.meuLocal;

import com.meuLocal.domain.Vagas;
import com.meuLocal.service.VagasService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class netImoveisApplicationTests {

	@Autowired
	private VagasService vagasService;

	@Test
	public void contextLoads() {
		System.out.println("method contextLoads working ok ...");
	}

	@Test
	public void listaLocaisProximosLocalizacao() {
		double lng = -33.333, lat = -25.555;
		List<Vagas> vagas = new ArrayList<Vagas>();
		Vagas v = new Vagas();
		v.setId(1);
		v.setLatitude(-35.333);
		v.setLongitude(-36.555);
		vagas.add(v);

		vagas = vagasService.findByLocalizacao(lng, lat);

		assertEquals(3,vagas.get(0).getId());
	}

}
