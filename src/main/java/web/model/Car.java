package web.model;

import java.util.Objects;

public class Car {
    private Long id;
    private String manufacturer;
    private String model;

    public Car() {
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id) && manufacturer.equals(car.manufacturer) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, model);
    }

    @Override
    public String toString() {
        return "ID " + id +
                ", manufacturer '" + manufacturer + '\'' +
                ", model '" + model + '\'';
    }
}
