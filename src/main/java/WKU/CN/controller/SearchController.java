package WKU.CN.controller;

import WKU.CN.DTO.JsonDTO;
import WKU.CN.DTO.StructureDTO;
import WKU.CN.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/searchpro")
    public List<JsonDTO> searchPro(@RequestParam String search){

        List<JsonDTO> result = new ArrayList<>();
        List<StructureDTO> st = searchService.structuresList(search.trim());

        for(int i = 0; i < st.size(); i++ ){

            result.add(i, st.get(i).convert(st.get(i)));

        }

        return result;
    }

}
