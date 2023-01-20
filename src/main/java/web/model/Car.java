package web.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    String model;
    int series;
    String color;

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    // getters

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    // setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
