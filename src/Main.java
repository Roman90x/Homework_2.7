
import Transport.Bus.Bus;
import Transport.Car.Car;
import Transport.Driver.DriverB;
import Transport.Driver.DriverC;
import Transport.Driver.DriverD;
import Transport.Mechanic.Mechanic;
import Transport.Mechanic.TypeTransport;
import Transport.Transport;
import Transport.Truck.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 1.");

        Car audi = new Car(" AUDI ", " A8 50 L TDI quattro ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));
        Car bmw = new Car(" BMW ", " Z8 ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));

        Truck scania = new Truck(" Scania ", " R520 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));
        Truck volvo = new Truck(" Volvo ", " FM13 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));

        Bus higer = new Bus(" Higer ", " KLQ6128LQ ",
                new DriverD(" Водитель автобуса ", true, 0));
        Bus mersedes = new Bus(" Mercedes-Benz ", " Sprinter ",
                new DriverD(" Водитель автобуса ", true, 0));


//        printInfo(audi);
//        printInfo(bmw);
//        printInfo(scania);
//        printInfo(volvo);
//        printInfo(higer);
//        printInfo(mersedes);


        Mechanic mechanic1 = new Mechanic(" Громов Егор ", " Реактор ", TypeTransport.CAR);
        Mechanic mechanic2 = new Mechanic(" Титов Денис ", " Автодром ", TypeTransport.TRUCK);
        Mechanic mechanic3 = new Mechanic(" Отто Марк ", " Инойл ", TypeTransport.BUS);
        Mechanic mechanic4 = new Mechanic(" Белов Антон ", " Авангард ", TypeTransport.ALL);

// Не могу добавить механика
//        car.addMechanic(mechanic1);

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println(transport.getDriver().getFullName() +
                "с правами " + transport.getDriver().isDriverLicense() +
                " и стажем вождения " + transport.getDriver().getExperience() + " лет " +
                "управляет транспортом" +
                transport.getBrand() +
                transport.getModel());
    }
}