import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Car {

    private final Model model;
    private final int year;
    private final int roomForPerson;
    private final Date date;
    private final int km;
    private final Color color;


    public Car(Model model, int year, int roomForPerson, Date date, int km, Color color) {
        this.model = model;
        this.year = year;
        this.roomForPerson = roomForPerson;
        this.date = date;
        this.km = km;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getRoomForPerson() {
        return roomForPerson;
    }

    public Date getDate() {
        return date;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", roomForPerson=" + roomForPerson +
                ", date=" + date.toLocaleString() +
                ", km=" + km +
                ",color = red: "+color.getRed()+" | green: "+color.getGreen()+" | blue: "+color.getBlue()+
                '}';
    }

    public static void main(String[] args) {

        Date date = new Date(2020,4,1);
        Car car = new Car(Model.FIAT,2020,4,date,1000,Color.RED);

        System.out.println(car.toString());
    }
}
