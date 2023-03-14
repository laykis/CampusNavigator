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

    private String sname;

    public static class Builder{

        private Long sid;
        private String sname;

        public Builder sid(Long sid){
            this.sid = sid;
            return this;
        }

        public Builder sname(String sname){
            this.sname = sname;
            return this;
        }

        public Structures build(){
            return new Structures(this);
        }
    }

    public Structures(Builder builder){

        this.sid = builder.sid;
        this.sname = builder.sname;

    }

    public StructureDTO convert(Structures structures){

        StructureDTO result = new StructureDTO();

        result.setSid(structures.getSid());
        result.setSname(structures.getSname());

        return result;

    }

    public List<StructureDTO> convertList(List<Structures> structures){

        List<StructureDTO> result = new ArrayList<>();


        for(int i = 0;i< structures.size();i++){

            result.add(i, convert(structures.get(i)));

        }

        return result;

    }

    public void changeSname (String sname){
        this.sname = sname;

    }

    public void changeSid (Long sid){
        this.sid = sid;
    }
    public List<Structures> arrayInit(int size){

        Structures structures = new Structures();
        structures.changeSname("");
        structures.changeSid(0L);

        List<Structures> result = new ArrayList<>();

        for(int i = 0; i < size; i++ ){

            result.add(i , structures);
        }

        return result;

    }
}
