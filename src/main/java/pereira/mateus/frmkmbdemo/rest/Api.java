package pereira.mateus.frmkmbdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/")
    public String hello() {
        return "Hello World!@@@33";
    }
}
