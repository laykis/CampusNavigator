package WKU.CN.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StructureDTO {

    private Long sid;
    private String sname;

    public JsonDTO convert(StructureDTO structureDTO){

        JsonDTO result = new JsonDTO();

        result.setId(structureDTO.getSid());
        result.setSearchResult(structureDTO.getSname());

        return result;
    }

}
