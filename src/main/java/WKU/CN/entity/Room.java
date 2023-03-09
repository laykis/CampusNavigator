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

    private String rname;
    private String location;
    private String sname;

    public static class Builder{

        private String rname;
        private String location;
        private String sname;

        public Builder rname(String rname){
            this.rname = rname;
            return this;
        }

        public Builder location(String location){
            this.location = location;
            return this;
        }

        public Builder sname(String sname){
            this.sname = sname;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }

    public Room(Builder builder){
        this.rname = builder.rname;
        this.location = builder.location;
        this.sname = builder.sname;
    }

    public RoomDTO convert(Room room){

        RoomDTO result = new RoomDTO();

        result.setRid(room.getRid());
        result.setRname(room.getRname());
        result.setLocation(room.getLocation());
        result.setSname(room.getSname());

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
