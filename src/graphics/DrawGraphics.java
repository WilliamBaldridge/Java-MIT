package graphics;

import graphics.BouncingBox;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

public class DrawGraphics {

//    BouncingBox box;

    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>(Arrays.asList(
            new BouncingBox(150, 50, Color.RED),
            new BouncingBox(20, 10, Color.BLUE),
            new BouncingBox(100, 100, Color.GREEN)

    ));

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        boxes.get(0).setMovementVector(1,0);
        boxes.get(1).setMovementVector(-3,-2);
        boxes.get(2).setMovementVector(1,1);

    }


    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        for (BouncingBox box : boxes) {
            box.draw(surface);
        }

    }

}