package com.antro.app.Repositories;

import com.antro.app.Models.Gps;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpsRepository extends MongoRepository<Gps, ObjectId> {
}
