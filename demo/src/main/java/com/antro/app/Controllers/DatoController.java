package com.antro.app.Controllers;

import com.antro.app.Models.Dato;
import com.antro.app.Services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatoController {
    @Autowired
    private DataService dataService;


    @PostMapping("/datos")
    public ResponseEntity<?> saveData(@RequestBody Dato dato){
        try {
            Dato  d = dataService.addData(dato.getDeviceId(),dato.getLatitud(),dato.getLongitud());
            return new ResponseEntity<>(d, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
