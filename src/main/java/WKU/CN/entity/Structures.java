package WKU.CN.entity;

import lombok.Getter;

import javax.persistence.*;
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
}
