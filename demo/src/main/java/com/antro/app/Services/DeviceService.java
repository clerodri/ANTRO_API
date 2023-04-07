package com.antro.app.Services;


import com.antro.app.Models.Dato;
import com.antro.app.Models.Device;
import com.antro.app.Models.Usuario;
import com.antro.app.Repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
        @Autowired
        DeviceRepository deviceRepository;

        @Autowired
        private MongoTemplate mongoTemplate;

    public Device createDevice( Device dev){
        Device device=  deviceRepository.insert(new Device(dev.getDeviceName(),dev.getModelName()));  // this meth return the data/object that u re inserting.
        mongoTemplate.update(Usuario.class)   //updating  database adding new information/
                .matching(Criteria.where("imdbId").is(dev.getImdbId()))
                .apply(new Update().push("devices").value(device)).first();

        return device;
    }

}
