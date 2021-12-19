package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Accessory;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Laurita
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {
    
    public List<Accessory> findByPriceLessThanEqual (double precio);
    
    //RETO 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Accessory> findByDescriptionLike (String description);

}
