package racinggame.domain;

public class Car {

    public String name;
    public int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void move(int num) {
        if (num >= 4) {
            this.distance++;
        }
    }
}
