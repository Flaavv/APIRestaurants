package fr.fl.restaurant.dao;

import org.springframework.data.repository.CrudRepository;

import fr.fl.restaurant.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, String> {
	
}
