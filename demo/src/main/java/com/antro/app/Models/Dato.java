package com.antro.app.Models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "datos")
@Data
public class Dato {

    private String deviceId;
    private String latitud;
    private String longitud;

    public Dato(String deviceId, String latitud, String longitud) {
        this.deviceId = deviceId;
        this.latitud = latitud;
        this.longitud = longitud;
    }
}
