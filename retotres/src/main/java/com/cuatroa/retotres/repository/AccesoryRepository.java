package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Accessory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.AccessoryCrudRepository;

/**
 *
 * @author Laurita
 */
@Repository
public class AccesoryRepository {
    @Autowired
    private AccessoryCrudRepository accessoryCrudRepository;

    public List<Accessory> getAll() {
        return accessoryCrudRepository.findAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return accessoryCrudRepository.findById(reference);
    }
    
    public Accessory create(Accessory accesory) {
        return accessoryCrudRepository.save(accesory);
    }

    public void update(Accessory accesory) {
        accessoryCrudRepository.save(accesory);
    }
    
    public void delete(Accessory accesory) {
        accessoryCrudRepository.delete(accesory);
    }
    
    
    public List<Accessory> accessoryByPrice(double price) {
        return accessoryCrudRepository.findByPriceLessThanEqual(price);
    }

    //Reto 5
    public List<Accessory> findByDescriptionLike(String description) {
        return accessoryCrudRepository.findByDescriptionLike(description);
    }
}
