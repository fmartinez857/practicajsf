package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;


@ManagedBean
@ViewScoped
public class RestauranteController {
	
	/**
	 * Lista de restaurantes para la tabla
	 */
	private List<Restaurante> restaurantes;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	private RestauranteService restauranteService = new RestauranteService();
	
	/**
	 * Metodo para consultar la lista de restaurante
	 */
	public void consultarRestaurantes()
	{
		this.restaurantes = this.restauranteService.consultarRestaurantes();
	}
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
	

}
