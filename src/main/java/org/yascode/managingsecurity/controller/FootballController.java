package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Football.*;

@RestController
@RequestMapping(value = FOOTBALL_PATH)
public class FootballController {

    @GetMapping(value = FOOTBALL_START)
    public String start(){
        return "this show football controller";
    }

}
