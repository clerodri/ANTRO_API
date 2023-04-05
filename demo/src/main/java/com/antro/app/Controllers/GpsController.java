package com.antro.app.Controllers;


import com.antro.app.Models.Gps;
import com.antro.app.Services.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GpsController {
    @Autowired
    GpsService gpsService;

    @GetMapping("/api/v1/data")
    public ResponseEntity<?> getAllData(){
        List<Gps> datos =  gpsService.getData();
        if(datos.size() > 0){
            return new ResponseEntity<>(datos,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No existen Datos", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/gps")
    public ResponseEntity<?> saveData(@RequestBody Gps data){
        try {
            gpsService.addGps(data);
            return new ResponseEntity<>(data,HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
