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

    @PostMapping("/searchpro")
    public List<JsonDTO> searchPro(@RequestParam String search){

        System.out.println(search);
        List<JsonDTO> json = new ArrayList<>();
        JsonDTO json1 = new JsonDTO();
        JsonDTO json2 = new JsonDTO();

        json1.setId(0l);
        json1.setSearchResult(search);
        json.add(json1);
        json2.setId(1l);
        json2.setSearchResult(search + "test2");
        json.add(json2);

        System.out.println(json.get(0).getId());
        System.out.println(json.get(1).getId());



        return json;
    }
}
