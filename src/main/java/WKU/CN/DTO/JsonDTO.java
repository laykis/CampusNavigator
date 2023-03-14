package WKU.CN.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class JsonDTO {

    private Long id;
    private String searchResult;

    public List<JsonDTO> arrayInit(int size){

        JsonDTO jsonDTO = new JsonDTO();
        List<JsonDTO> result = new ArrayList<>();

        jsonDTO.setId(0L);
        jsonDTO.setSearchResult("");

        for(int i = 0; i < size; i++){

            result.add(i, jsonDTO);

        }

        return result;

    }
}
