package fr.fl.restaurant.rest;
//classe qui sert à exposer les méthodes pour créer, récupérer, mettre à jour, supprimer... 
//classe CRUD

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.fl.restaurant.model.Restaurant;
import fr.fl.restaurant.services.RestaurantsServices;

@RestController //nous permet de definir un controller Rest, toutes les méthodes nous remonteront des données sous forme JSON
("/restaurants") //toutes les méthodes annotées @RequestMapping sont accessibles à l'URL '/restaurants'
public class RestaurantController {
		
	@Autowired
	private RestaurantsServices restoService;
	@GetMapping("/restaurants") //quand on fait un get sur '/restaurant' on obtiendra la liste de tout les restaurants grâce à cette annotation
	public List<Restaurant> findAll(){
		return restoService.findAll();
	}
	
}
