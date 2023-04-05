package com.antro.app.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "gps")
@Data
@AllArgsConstructor //anonation for the constructur takes all the fields variables
@NoArgsConstructor
public class Gps {
    @Id
    private ObjectId id;
    private String dataId;
    private List<String> data;
    @DocumentReference
    private String deviceId;

//    public Gps(String dataId, String clientId, List<String> data) {
//        this.dataId = dataId;
//        this.clientId = clientId;
//        this.data = data;
//    }
}
