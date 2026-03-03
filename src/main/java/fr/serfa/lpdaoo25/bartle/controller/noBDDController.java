package fr.serfa.lpdaoo25.bartle.controller;


import fr.serfa.lpdaoo25.bartle.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
// default path /noBDD
@RequestMapping("/noBDD")
public class noBDDController {

    @GetMapping("/circle")
    public Circle getCircle() {
        return new Circle(17, Shape.ShapeColor.GREEN);
    }

    @GetMapping("/rectangle")
    public Shape getRectangle() {
        return new Rectangle(40,20, Shape.ShapeColor.BLUE);
   }


    @GetMapping("/card/{nbrOfShapes}")
    public Card getCard(@PathVariable int nbrOfShapes) {
        Set<Shape> shapes = new HashSet<>();
        for (int i = 0; i < nbrOfShapes; i++) {
            switch (Shape.ShapeType.getRandom()){
                case CIRCLE -> shapes.add(new Circle(17, Shape.ShapeColor.GREEN));
                case TRIANGLE -> shapes.add(new Triangle(10, 15, Shape.ShapeColor.PURPLE));
                case RECTANGLE -> shapes.add(new Rectangle(10,20, Shape.ShapeColor.BLUE));
                case SQUARE -> shapes.add(new Square(10, Shape.ShapeColor.RED));
                case HEXAGON -> shapes.add(new Hexagon(10, Shape.ShapeColor.YELLOW));
                case PENTAGON -> shapes.add(new Pentagon(10, Shape.ShapeColor.ORANGE));
            }
        }
        return new Card(shapes);
    }


}
