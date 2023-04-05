package com.antro.app.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "clientes")
@Data
@AllArgsConstructor //anonation for the constructur takes all the fields variables
@NoArgsConstructor
public class Cliente {


    private String clienteId;
    private String clienteName;
    @DocumentReference
    private String deviceId;
    private String phoneName;
}
