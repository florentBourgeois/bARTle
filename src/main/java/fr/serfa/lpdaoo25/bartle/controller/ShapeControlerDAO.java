package fr.serfa.lpdaoo25.bartle.controller;

import fr.serfa.lpdaoo25.bartle.model.*;
import fr.serfa.lpdaoo25.bartle.repository.ShapeDAO;
import fr.serfa.lpdaoo25.bartle.service.ShapeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeControlerDAO {

    private ShapeService shapeService;

    private ShapeDAO shapeDAO;

    public ShapeControlerDAO(ShapeService shapeService, ShapeDAO shapeDAO) {
        this.shapeService = shapeService;
        this.shapeDAO = shapeDAO;
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

    @GetMapping("/{idShape}")
    public Shape getShapeParID(@PathVariable Long idShape){
        return this.shapeDAO.findById(idShape).get();
    }

    @PostMapping("")
    public Shape ajouterShape(@RequestBody ShapeACreerDTO s){
        Shape res =null;
        switch (s.type()){
            case CIRCLE -> res = new Circle(s.length(), s.color());
            case TRIANGLE -> res = new Triangle(s.length(), s.height(), s.color());
            case RECTANGLE -> res = new Rectangle(s.length(), s.height(), s.color());
            case SQUARE -> res = new Square(s.length(), s.color());
            case HEXAGON -> res = new Hexagon(s.length(), s.color());
        }
        shapeDAO.save(res);
        return res;
    }

}
