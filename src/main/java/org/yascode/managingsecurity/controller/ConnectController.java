package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Connect.*;

@RestController
@RequestMapping(value = CONNECT_PATH)
public class ConnectController {

    @GetMapping(value = CONNECT_START)
    public String start(){
        return "this show connect controller";
    }

}
