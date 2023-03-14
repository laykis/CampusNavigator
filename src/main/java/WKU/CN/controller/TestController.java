package WKU.CN.controller;

import WKU.CN.DTO.JsonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String home(){
        return "Hello, world";
    }

    @GetMapping("/hello/siri")
    public String dohyun() {
        return "시리야 사랑해";
    }


}
