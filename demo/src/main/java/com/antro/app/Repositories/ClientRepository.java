package com.antro.app.Repositories;

import com.antro.app.Models.Cliente;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Cliente, ObjectId> {
}
