package com.dow.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steve on 10/16/15.
 */
@RequestMapping("/board")
@RestController
public class BoardRoute {

    @RequestMapping("/")
    ResponseEntity<?> home() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}