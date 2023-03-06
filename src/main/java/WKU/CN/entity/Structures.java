package WKU.CN.entity;

import WKU.CN.DTO.StructureDTO;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Structures {

    public Structures(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;

    private String sName;

    public static class Builder{

        private String sName;

        public Builder sName(String sName){
            this.sName = sName;
            return this;
        }

        public Structures build(){
            return new Structures(this);
        }
    }

    public Structures(Builder builder){
        this.sName = builder.sName;
    }

    public StructureDTO convert(Structures structures){

        StructureDTO result = new StructureDTO();

        result.setSid(structures.getSid());
        result.setSName(structures.getSName());

        return result;

    }

    public List<StructureDTO> convertList(List<Structures> structures){

        List<StructureDTO> result = new ArrayList<>();

        for(int i = 0;i< structures.size();i++){

            result.set(i, convert(structures.get(i)));
        }

        return result;

    }
}
