package cesarvalenzuela;

import java.awt.Color;
import java.awt.Graphics;

public class BouncingBallDB extends DBAnimationApplet implements Bounceable {
    private int x, y;
    private int dx = -2, dy = -4;
    private int radius = 20;
    private Color color = Color.GREEN;
    Bounceable b;

    public void init() {
        delay=10;
        super.init();
        x = dim.width * 2 / 3;
        y = dim.height - radius;

    }

    protected void paintFrame(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
//        if (x < radius || x > dim.width - radius) {
//            dx = -dx;
//        }
//        if (y < radius || y > dim.height - radius) {
//            dy = -dy;
//        }
//        x += dx;
//        y += dy;
//        g.setColor(color);
//        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);

        draw(g);
    }

    @Override
    public void draw(Graphics g) {
        b = new CircleBall(g, Color.MAGENTA, dim);
        b.draw(g);
    }
}