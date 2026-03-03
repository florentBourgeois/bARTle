package fr.serfa.lpdaoo25.bartle.model;


import java.util.HashSet;
import java.util.Set;

public class Card {


    private static Long idGenerator = 0L;
    private Long id = idGenerator++;

    private Set<Shape> shapes = new HashSet<>();

    //TODO remove this setter when we have a proper database
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Card(Set<Shape> shapes) {
        this.shapes = shapes;
    }

    public Card() {

    }

    public Set<Shape> getShapes() {
        return shapes;
    }

    public boolean contains(Shape shape) {
        return this.shapes.contains(shape);
    }


    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", shapes=" + shapes +
                '}';
    }

}
