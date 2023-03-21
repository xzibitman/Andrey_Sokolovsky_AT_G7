package homework.week7;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && width == chair.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

}
