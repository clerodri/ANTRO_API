package com.antro.app.Controllers;


import com.antro.app.Models.Device;
import com.antro.app.Services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/devices")
    public ResponseEntity<?> createDevice(@RequestBody Device device){
        return new ResponseEntity<>(deviceService.createDevice(device), HttpStatus.CREATED);
    }

}
