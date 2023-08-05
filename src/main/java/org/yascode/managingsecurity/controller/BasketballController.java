package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Basketball.*;

@RestController
@RequestMapping(value = BASKET_BALL_PATH)
public class BasketballController {

    @GetMapping(value = BASKET_BALL_START)
    public String start(){
        return "this show basketball controller";
    }

}
