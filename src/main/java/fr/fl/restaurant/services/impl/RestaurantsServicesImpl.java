package fr.fl.restaurant.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fl.restaurant.dao.RestaurantRepository;
import fr.fl.restaurant.model.Restaurant;
import fr.fl.restaurant.services.RestaurantsServices;

@Service //composant Spring injectable dans une autre composant
public class RestaurantsServicesImpl implements RestaurantsServices {
	
	@Autowired
	private RestaurantRepository restoRepository;
	
	@Override
	public List<Restaurant> findAll() {
		List<Restaurant> liste = new ArrayList<Restaurant>();
		restoRepository.findAll().forEach(liste::add); //pour chaque element trouvé dans findAll(), on va l'ajouter dans la liste
		
		
		return liste;
	}

}
