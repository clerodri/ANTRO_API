package com.antro.app.Services;

import com.antro.app.Models.Gps;
import com.antro.app.Repositories.GpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GpsService {
    @Autowired
    private GpsRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Gps addGps(Gps gps_data){

        return repository.save(gps_data);
    }
    public List<Gps> getData(){
        return repository.findAll();
    }
//    public Review createReview(String reviewBody, String imdbId){
//        Review review=  reviewRepository.insert(new Review(reviewBody));  // this meth return the data/object that u re inserting.
//        mongoTemplate.update(Movie.class)   //updating  database adding new information/
//                .matching(Criteria.where("imdbId").is(imdbId))
//                .apply(new Update().push("reviewIds").value(review)).first();
//        return review;
//    }
}
