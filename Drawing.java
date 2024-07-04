package javatest;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    public String[] colours;
    public String[] shapes;

    public static class Art {
        public String colour;
        public String shape;

        public Art(String colour, String shape) {
            this.colour = colour;
            this.shape = shape;
        }
    }

    public Drawing(String[] colours, String[] shapes) {
        this.colours = colours;
        this.shapes = shapes;
    }

    public List<Art> mix() {
        List<Art> combinations = new ArrayList<>();
        for (String colour : colours) {
            for (String shape : shapes) {
                combinations.add(new Art(colour, shape));
            }
        }
        return combinations;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Drawing draw = new Drawing(new String[]{ "red", "blue" }, new String[]{ "circle" });
        List<Art> mixes = draw.mix();
        // Should print:
        // red, circle
        // blue, circle
        for (Art art : mixes) {
            System.out.println(art.colour + ", " + art.shape);
        }
    }
}
