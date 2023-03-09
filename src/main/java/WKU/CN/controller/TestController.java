package WKU.CN.controller;

import WKU.CN.DTO.JsonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class TestController {

    @GetMapping("/hello")
    public String home(){
        return "Hello, world";
    }

    @PostMapping("/searchpro")
    public JsonDTO searchPro(JsonDTO jsonDTO){

        JsonDTO json = new JsonDTO();
        System.out.println(jsonDTO.getSearch());

        json.setSearchResult(jsonDTO.getSearch());

        return json;
    }
}
