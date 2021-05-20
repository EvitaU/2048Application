import java.awt.*;

public class Tile {

    int value;
    Color tileColor;

    public Tile() {
        this.value = 0;
    }

    public Tile(int number) {
        this.value = number;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + this.value;
    }

    public void setColor() {
        if (this.getValue() == 2) {
            this.tileColor = new Color(152, 251, 152);
        } else if (this.getValue() == 4) {
            this.tileColor = new Color(118, 216, 118);
        } else if (this.getValue() == 8) {
            this.tileColor = new Color(29, 193, 29);
        } else if (this.getValue() == 16) {
            this.tileColor = new Color(128, 228, 52);
        } else if (this.getValue() == 32) {
            this.tileColor = new Color(242, 235, 50);
        } else if (this.getValue() == 64) {
            this.tileColor = new Color(245, 187, 53);
        } else if (this.getValue() == 128) {
            this.tileColor = new Color(243, 131, 66);
        } else if (this.getValue() == 256) {
            this.tileColor = new Color(255, 105, 68);
        } else if (this.getValue() == 512) {
            this.tileColor = new Color(255, 68, 68);
        } else if (this.getValue() == 1024) {
            this.tileColor = new Color(222, 12, 12);
        } else {
            this.tileColor = new Color(188, 100, 255);
        }
    }

    public Color getColor() {
        this.setColor();
        return this.tileColor;
    }
}
