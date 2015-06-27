package br.com.bestsmart.presentation.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.bestsmart.presentation.rest.PresentationRestApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PresentationRestApplication.class)
@WebAppConfiguration
public class PresentationRestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
