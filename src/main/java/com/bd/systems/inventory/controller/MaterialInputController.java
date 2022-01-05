package com.bd.systems.inventory.controller;

import com.bd.systems.inventory.domains.MaterialInput;
import com.bd.systems.inventory.service.MaterialInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material-input")
public class MaterialInputController {

    @Autowired
    private MaterialInputService materialInputService;

    @PostMapping("/")
    public ResponseEntity<MaterialInput> saveMaterialInput(@RequestBody MaterialInput materialInput){
        return new ResponseEntity<>(materialInput, HttpStatus.OK);
    }
}
