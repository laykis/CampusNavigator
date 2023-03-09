package WKU.CN.service;

import WKU.CN.DTO.RoomDTO;
import WKU.CN.DTO.StructureDTO;

import WKU.CN.entity.Room;
import WKU.CN.entity.Structures;
import WKU.CN.repository.RoomRepository;
import WKU.CN.repository.StructuresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final StructuresRepository structuresRepository;
    private final RoomRepository roomRepository;

    public List<String> structuresList(){

        List<String> result = new ArrayList<>();
        List<Structures> st = structuresRepository.findAll();

        for(int i = 0;i < st.size(); i++){

            result.set(i, st.get(i).getSName());
        }

        return result;

    }

    public List<RoomDTO> roomList(String sName){

        List<RoomDTO> result = new ArrayList<>();
        List<Room> roomList = roomRepository.findBySname(sName);

        for(int i=0;i<roomList.size();i++){

            result.set(i, roomList.get(i).convert(roomList.get(i)));
        }

        return result;
    }

}
