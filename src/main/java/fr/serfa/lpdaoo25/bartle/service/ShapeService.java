package fr.serfa.lpdaoo25.bartle.service;

import fr.serfa.lpdaoo25.bartle.model.Circle;
import fr.serfa.lpdaoo25.bartle.model.Rectangle;
import fr.serfa.lpdaoo25.bartle.model.Shape;
import fr.serfa.lpdaoo25.bartle.repository.ShapeDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {

    private ShapeDAO shapeDAO;

    public ShapeService(ShapeDAO shapeDAO) {
        this.shapeDAO = shapeDAO;

        shapeDAO.save(new Circle());
        shapeDAO.save(new Circle());
        shapeDAO.save(new Circle());
        shapeDAO.save(new Circle());
        shapeDAO.save(new Rectangle());
    }

    public List<Shape> getAllShapes(){
        return shapeDAO.findAll();
    }

}
