package com.distribuida.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("HOLA MUNDO SPRING BOOT...!!");

		Cliente cliente = new Cliente(
				1,
				"1753477551",
				"Danny",
				"Espinoza",
				"Yaruqui",
				"0986231979",
				"dannyespinoza819@gmail.com"
		);


	}

}
