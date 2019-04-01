import java.awt.*;

public class NoFlyMyRect {
    private Color color = Color.black;
    private int x, y, x2, y2;

    public NoFlyMyRect(Color color) {
        this.color = color;

    }

    public NoFlyMyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
        this.color = color;
        this.x = upperX;
        this.y = upperY;
        this.x2 = lowerX;
        this.y2 = lowerY;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
}