package com.iset.soatp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.soatp2.dao.OffreRepository;
import com.iset.soatp2.entities.Offre;

@SpringBootApplication
public class Soatp2Application implements CommandLineRunner {

	@Autowired
	OffreRepository offreRepository;

	public static void main(String[] args) {
		SpringApplication.run(Soatp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreRepository.save(new Offre(0, "Web Design","informatique", "AXA", 2, "France"));
		offreRepository.save(new Offre(0, "Developpeur","informatique", "Talys", 3, "Tunisie"));
		offreRepository.save(new Offre(0, "Architecte","informatique", "SIS", 2, "Allemagne"));
	}
}