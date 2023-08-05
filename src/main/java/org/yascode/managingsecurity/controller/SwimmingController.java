package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Swimming.*;

@RestController
@RequestMapping(value = SWIMMING_PATH)
public class SwimmingController {

    @GetMapping(value = SWIMMING_START)
    public String start(){
        return "this show swimming controller";
    }
}
