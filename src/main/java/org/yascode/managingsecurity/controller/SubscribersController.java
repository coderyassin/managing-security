package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Subscribers.*;

@RestController
@RequestMapping(value = SUBSCRIBERS_PATH)
public class SubscribersController {

    @GetMapping(value = SUBSCRIBERS_START)
    public String start(){
        return "this show subscribers controller";
    }

}
