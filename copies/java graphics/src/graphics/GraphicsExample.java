package graphics;

import java.awt.*;

public class GraphicsExample {
    Graphics2D pen;

    public void render() {
        // Write your graphics code here!
        
    }

    public void update() {
        // Write your graphics code here!
    }

    private void setColor(Color color) {
        pen.setColor(color);
    }

    private void drawLine(int x1, int y1, int x2, int y2) {
        pen.drawLine(x1, y1, x2, y2);
    }

    private void fillRect(int x, int y, int width, int height) {
        pen.fillRect(x, y, width, height);
    }

    private void fillCircle(int x, int y, int radius) {
        pen.fillArc(x - radius, y - radius, radius * 2, radius * 2, 0, 360);
    }

    public void setPen(Graphics2D newPen) {
        pen = newPen;
    }
}
