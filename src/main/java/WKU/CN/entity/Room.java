package WKU.CN.entity;

import WKU.CN.DTO.RoomDTO;
import WKU.CN.DTO.StructureDTO;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Room {

    public Room(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rid;

    private String rName;
    private String location;
    private String sName;

    public static class Builder{

        private String rName;
        private String location;
        private String sName;

        public Builder rName(String rName){
            this.rName = rName;
            return this;
        }

        public Builder location(String location){
            this.location = location;
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
        this.location = builder.location;
        this.sName = builder.sName;
    }

    public RoomDTO convert(Room room){

        RoomDTO result = new RoomDTO();

        result.setRid(room.getRid());
        result.setRName(room.getRName());
        result.setLocation(room.getLocation());
        result.setSName(room.getSName());

        return result;

    }

    public List<RoomDTO> convertList(List<Room> room){

        List<RoomDTO> result = new ArrayList<>();

        for(int i = 0;i< room.size();i++){

            result.set(i, convert(room.get(i)));
        }

        return result;

    }
}
