package com.development.todo1.controller;


import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.VehicleEntity;
import com.development.todo1.service.VehicleService;
import com.development.todo1.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    protected VehicleService service;
    // rolValidator = new RolValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<VehicleEntity> list(){
        return this.service.findAll().get();
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse save(@RequestBody  @Valid VehicleEntity  json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        //VehicleEntity data = this.mapper.readValue(json, VehicleEntity.class);
        this.service.save(json);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }

}
