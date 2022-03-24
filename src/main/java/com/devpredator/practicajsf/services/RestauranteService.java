package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;


public class RestauranteService {
	
	/**
	 * Metodo que permite consultar la lista de restaurantes
	 * @return ({@link Empleado} lista de restaurantes.
	 */
	public List<Restaurante> consultarRestaurantes()
	{
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante r1 = new Restaurante();
		r1.setNombre("Vips");
		r1.setDireccion("Rojo Gomez");
		r1.setPais("Mexico");
		Gerente g1 = new Gerente();
		g1.setNombre("Raul");
		g1.setPrimerApellido("Martinez");
		r1.setGerente(g1);
		
		Restaurante r2 = new Restaurante();
		r2.setNombre("El Porton");
		r2.setDireccion("Rojo Gomez");
		r2.setPais("Mexico");
		Gerente g2 = new Gerente();
		g2.setNombre("Javier");
		g2.setPrimerApellido("Sanchez");
		r2.setGerente(g2);
		
		Restaurante r3 = new Restaurante();
		r3.setNombre("Chilis");
		r3.setDireccion("Rojo Gomez");
		r3.setPais("Mexico");
		Gerente g3 = new Gerente();
		g3.setNombre("Rafael");
		g3.setPrimerApellido("Martinez");
		r3.setGerente(g3);
		
		Restaurante r4 = new Restaurante();
		r4.setNombre("Italianis");
		r4.setDireccion("Rojo Gomez");
		r4.setPais("Mexico");
		Gerente g4 = new Gerente();
		g4.setNombre("Rogelio");
		g4.setPrimerApellido("Rodriguez");
		r4.setGerente(g4);
		
		Restaurante r5 = new Restaurante();
		r5.setNombre("Samborns");
		r5.setDireccion("Rojo Gomez");
		r5.setPais("Mexico");
		Gerente g5 = new Gerente();
		g5.setNombre("Ana");
		g5.setPrimerApellido("Martinez");
		r5.setGerente(g5);
		
		
		restaurantes.add(r1);
		restaurantes.add(r2);
		restaurantes.add(r3);
		restaurantes.add(r4);
		restaurantes.add(r5);
		
		return restaurantes;
	}

}
