package WKU.CN.controller;

import WKU.CN.DTO.JsonDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @PostMapping("/searchpro")
    public List<JsonDTO> searchPro(@RequestParam String search){

        List<JsonDTO> json = new ArrayList<>();


        return json;
    }
}
