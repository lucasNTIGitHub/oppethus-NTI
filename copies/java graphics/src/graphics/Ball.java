package graphics;

import java.awt.Graphics2D;

public class Ball {
    int x = 0;
    int y = 0;
    int xVelocity = 0;
    int yVelocity = 0;
    int radius = 0;

    public Ball(int x, int y, int radius, int xVelocity, int yVelocity) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public void update() {
        x += xVelocity;
        y += yVelocity;
    }

    public void render(Graphics2D pen) {
        pen.drawArc(x - radius, y - radius, radius * 2, radius * 2, 0, 360);
    }
}
