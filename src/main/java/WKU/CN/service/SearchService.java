package WKU.CN.service;

import WKU.CN.DTO.StructureDTO;

import WKU.CN.entity.Structures;
import WKU.CN.repository.StructuresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final StructuresRepository structuresRepository;


    public List<String> structuresList(String search){

        List<String> result = new ArrayList<>();
        List<Structures> st = structuresRepository.findBySNameContaining(search);

        for(int i = 0;i < st.size(); i++){

            result.set(i, st.get(i).getSName());
        }

        System.out.println(st.get(0).getSName()g);
        return result;

    }


}
