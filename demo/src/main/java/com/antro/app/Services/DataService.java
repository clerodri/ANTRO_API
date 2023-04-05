package com.antro.app.Services;

import com.antro.app.Models.Dato;
import com.antro.app.Repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    DataRepository dataRepository;

    public Dato addData(String deviceId, String latitud, String longitud){
        return  dataRepository.insert(new Dato(deviceId,latitud,longitud));
    }
}
