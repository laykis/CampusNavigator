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


    public List<StructureDTO> structuresList(String search){

        Structures sInit = new Structures();
        List<Structures> st = structuresRepository.findBySnameContaining(search.trim());
        List<StructureDTO> result = sInit.convertList(st);

        return result;

    }


}
