package com.rgmcode.demoprojectspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StatusController {

    @GetMapping("/status")
    public Status getStatus(){
        Status status = new Status("Das ist die Ausgabe");
        return status;
    }


}
