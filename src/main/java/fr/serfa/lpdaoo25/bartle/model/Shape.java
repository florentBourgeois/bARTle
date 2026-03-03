package fr.serfa.lpdaoo25.bartle.model;


public abstract class Shape {

    private static Long idGenerator = 0L;
    protected Long id = idGenerator++;
    private int x=  (int) (Math.random() * 500);
    private int y=  (int) (Math.random() * 500);

    protected ShapeType SHAPE_TYPE;

    private ShapeColor color;

    public Shape() {
        this.color = ShapeColor.getRandom();
    }

    public Shape(ShapeColor color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //TODO remove this setter when we have a proper database
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public ShapeColor getColor() {
        return color;
    }

    public abstract int getPerimeter();
    public abstract int getArea();

    public abstract int getWidth();
    public abstract int getHeight();

    public ShapeType getType() {
        return this.SHAPE_TYPE;
    }

    @Override
    public String toString() {
        return "Shape{" +
                id +
                ", " + SHAPE_TYPE +
                ", " + color +
                '}';
    }

    public enum ShapeType {
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        SQUARE,
        HEXAGON,
        PENTAGON;

        public static int size() {
            return values().length;
        }

        public static ShapeType getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public enum ShapeColor {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        BLACK,
        ORANGE,
        PURPLE,
        PINK,
        BROWN,
        GREY;

        public static int size() {
            return values().length;
        }

        public static ShapeColor getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

}
