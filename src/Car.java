public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;
    Car(String brand,String model,float engineVolume,String color,int year,String country){
        if (brand != null && brand != " ") {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && model != " ") {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null && color != " ") {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null && country != " ") {
            this.country = country;
        } else {
            this.country = "default";
        }

    }
    public String toString() {
        return "В наличии автомобиль " + brand + " " + model + "." + "Год выпуска: " + year + "." +
                "Сборка:" + country + "." + "Цвет:" + color + "." + "Объём двигателя: " + engineVolume + " л.";
    }
}
