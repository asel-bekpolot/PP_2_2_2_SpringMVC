package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    private String country;
    private int series;

    public Car(String name, String country, int series) {
        this.name = name;
        this.country = country;
        this.series = series;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
