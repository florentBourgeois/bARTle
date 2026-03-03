package fr.serfa.lpdaoo25.bartle.controller;

import fr.serfa.lpdaoo25.bartle.model.Shape;
import fr.serfa.lpdaoo25.bartle.service.ShapeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeControlerDAO {

    private ShapeService shapeService;

    public ShapeControlerDAO(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping("/detailed")
    public List<Shape> getAllShapes(){
        return shapeService.getAllShapes();
    }


    @GetMapping("")
    public List<ShapePourListDTO> getShapesIdType(){
        List<ShapePourListDTO> result = new ArrayList<>();

        List<Shape> allShapes = this.shapeService.getAllShapes();
        for (Shape s : allShapes){
            result.add(new ShapePourListDTO(s.getId(), s.getType()));
        }
        return result;
    }

}
