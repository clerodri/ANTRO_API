package com.antro.app.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("devices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    private ObjectId id;
    private String imdbId;
    private String deviceName;
    private String modelName;

    public Device(String imdbId,String deviceName){
        this.deviceName= deviceName;
        this.imdbId = imdbId;
    }
}
