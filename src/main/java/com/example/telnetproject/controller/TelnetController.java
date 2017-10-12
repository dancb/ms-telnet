package com.example.telnetproject.controller;

import com.example.telnetproject.model.TelnetModel;
import com.example.telnetproject.utils.Utilities;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelnetController {

    @RequestMapping(value = "/telnet", method = RequestMethod.POST)
    public ResponseEntity<?> telnet(@RequestBody TelnetModel telnetModel) {
        return new ResponseEntity<>(Utilities.conexionTelnet(telnetModel.getHost(), telnetModel.getPort()), HttpStatus.OK);
    }

}