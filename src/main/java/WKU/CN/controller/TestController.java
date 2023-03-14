package WKU.CN.controller;

import WKU.CN.DTO.JsonDTO;
import WKU.CN.entity.Structures;
import WKU.CN.repository.StructuresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final StructuresRepository structuresRepository;

    @GetMapping("/dbinsert")
    public String dbInsert(){

        File dir = new File("src/main/cnfront/src/img");
        String[] files = dir.list();
        Structures sInit = new Structures();

        List<Structures> structures = new ArrayList<>();

        for(int i = 0; i < files.length; i++ ){


            sInit.changeSid((long) i);
            sInit.changeSname(files[i]);

            structures.add(i, sInit);

            System.out.println(structures.get(i).getSname());
            structuresRepository.save(structures.get(i));

        }





        return "finished";

    }
}
