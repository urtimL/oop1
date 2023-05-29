package Lesson2H.base;

public abstract class Bird extends Animal{

    private Double flightAltitude;
    public Bird(Double growthAn, Double weightAn, String eyeColorAn,
                Double flightAltitudeN) {
        super(growthAn, weightAn, eyeColorAn);
        this.flightAltitude = flightAltitudeN;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Высота полёта = " + flightAltitude;
    }

    public Double getFlightAltitude() {
        return flightAltitude;
    }

    public void fly() {
        System.out.printf("Я лечу на %f метрах", this.flightAltitude);
    }
}
