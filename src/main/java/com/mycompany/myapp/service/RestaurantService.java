package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.RestaurantDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Restaurant.
 */
public interface RestaurantService {

    /**
     * Save a restaurant.
     *
     * @param restaurantDTO the entity to save
     * @return the persisted entity
     */
    RestaurantDTO save(RestaurantDTO restaurantDTO);

    /**
     *  Get all the restaurants.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<RestaurantDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" restaurant.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    RestaurantDTO findOne(Long id);

    /**
     *  Delete the "id" restaurant.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
