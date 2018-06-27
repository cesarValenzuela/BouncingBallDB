package cesarvalenzuela;

import java.awt.*;

/**
 * Author: Cesar Valenzuela
 * Date: 6/26/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class CircleBall extends BouncingBallDB implements Bounceable {
    //public CircleBall(Graphics offscreen, , Color color, Dimension dm){}
    public Graphics offscreen;
    Color color;
    Dimension dm;
    private int x, y;
    private int dx = -2, dy = -4;
    private int radius = 20;


    public CircleBall(Graphics offscreen, Color color, Dimension dm) {
        this.offscreen = offscreen;
        this.color = color;
        this.dm = dm;

    }

    public void update() {
        if (x < radius || x > dim.width - radius) {
            dx = -dx;
        }
        if (y < radius || y > dim.height - radius) {
            dy = -dy;
        }
        x += dx;
        y += dy;
    }

    @Override
    public void draw(Graphics offscreen) {

        offscreen.setColor(color);
        offscreen.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
