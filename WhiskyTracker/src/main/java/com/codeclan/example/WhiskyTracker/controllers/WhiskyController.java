package com.codeclan.example.WhiskyTracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskeyRepository whiskeyRepository;

    @GetMapping
    public List<Distillery> getAllWhiskeys(){
        return whiskeyRepository.findAll();
    }

}
