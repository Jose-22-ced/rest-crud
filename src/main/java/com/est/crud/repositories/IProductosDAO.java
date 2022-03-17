package com.est.crud.repositories;

import com.est.crud.models.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosDAO extends MongoRepository<Productos,String> {
}
