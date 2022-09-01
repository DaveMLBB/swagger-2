package co.develhope.swagger2.controllers;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping("")
    @ApiOperation(value = "Say hello", notes = "prints out the welcome message for the user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 400, message = "Bad input data")
    public String sayHello(){
        return "welcome";
    }
}
