package Pieces;

public class pieces {
    public char colour;
    public char type;
    public int id;

    // the Bicycle class has one constructor
    public pieces(char colour, char type, int id)
    {
        this.colour = colour;
        this.type = type;
        this.id = id;
    }

    public void setColour(char colour){
        this.colour = colour;
    }

    public char getColour() {
        return colour;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
