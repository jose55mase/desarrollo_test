package com.development.todo1.controller;


import com.development.todo1.entity.ProductEntity;
import com.development.todo1.entity.VehicleEntity;
import com.development.todo1.service.ProductService;
import com.development.todo1.service.VehicleService;
import com.development.todo1.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    protected ProductService service;
    // rolValidator = new RolValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<ProductEntity> list(){
        return this.service.findAll().get();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        ProductEntity data = this.mapper.readValue(json, ProductEntity.class);
        this.service.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }


    /*
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RestResponse  update(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        CandidateEntity data = this.mapper.readValue(json, CandidateEntity.class);
        this.service.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Actualizado");
    }

*/
}
