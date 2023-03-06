package WKU.CN.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Room {

    public Room(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rid;

    private String rName;

    private String sName;

    public static class Builder{

        private String rName;
        private String sName;

        public Builder rName(String rName){
            this.rName = rName;
            return this;
        }

        public Builder sName(String sName){
            this.sName = sName;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }

    public Room(Builder builder){
        this.rName = builder.rName;
        this.sName = builder.sName;
    }
}
