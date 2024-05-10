package etc.lamdba;


import java.util.Objects;

public class Apple {
    private int weigh;
    private Color color;



    public Apple() {


    }
    public Apple(int weigh, Color color) {
        this.weigh = weigh;
        this.color = color;
    }

    public int getWeigh() {
        return weigh;
    }

    public Color getColor() {
        return color;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weigh == apple.weigh && color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weigh, color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weigh=" + weigh +
                ", color=" + color +
                '}';
    }
}
