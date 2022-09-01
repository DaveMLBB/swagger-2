package co.develhope.swagger2.controllers;


import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @ApiOperation(value = "Say hello", notes = "prints out the welcome message for math")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 400, message = "Bad input data")
    public String welcomeMathMsg(){
        return "welcome";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "division info", notes = "prints out the division info")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 400, message = "Bad input data")
    public ArithmeticOperation divisionInfo() {
        return new ArithmeticOperation(
                "division",
                1,
                "numeratore/denominatore=quoziente",
                "invariantiva, distributiva");
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "multiplication", notes = "prints out the multiplication of a*b")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 400, message = "Bad input data")
    public Integer multiplication(@RequestParam Integer a, @RequestParam Integer b) {
        return a*b;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "square", notes = "prints out the square of n")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 400, message = "Bad input data")
    public Integer multiplication(@RequestParam Integer n) {
        return n*n;
    }
}
