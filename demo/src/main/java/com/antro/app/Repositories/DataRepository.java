package com.antro.app.Repositories;

import com.antro.app.Models.Dato;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataRepository  extends MongoRepository<Dato, ObjectId> {


}

//@RestController
//public class GpsController {
//    @Autowired
//    GpsService gpsService;
//
//    @GetMapping("/api/v1/data")
//    public ResponseEntity<?> getAllData(){
//        List<Gps> datos =  gpsService.getData();
//        if(datos.size() > 0){
//            return new ResponseEntity<>(datos, HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>("No existen Datos", HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping("/gps")
//    public ResponseEntity<?> saveData(@RequestBody Gps data){
//        try {
//            gpsService.addGps(data);
//            return new ResponseEntity<>(data,HttpStatus.CREATED);
//        }catch (Exception e){
//            return new ResponseEntity<>(e.getMessage().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//}
