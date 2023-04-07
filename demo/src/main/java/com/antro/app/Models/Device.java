package com.antro.app.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
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

    public Device(String deviceName,String modelName){
        this.deviceName= deviceName;
        this.modelName = modelName;
    }
}
