package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Student.*;

@RestController
@RequestMapping(value = ABOUT_PATH)
public class AboutController {

    @GetMapping(ABOUT_START)
    public String start(){
        return "this show about us controller";
    }

}
