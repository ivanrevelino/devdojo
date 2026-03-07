package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red" ,2019));


    public static void main(String[] args) {
        System.out.println(filterGreenCars(cars));
        System.out.println(filterCarsByColor(cars, "green"));
        System.out.println(filterCarsByColor(cars, "black"));

        System.out.println(filterByYearBefore(cars, 2025));

    }

    private static List<Car> filterGreenCars(List<Car> cars) {
        List <Car> filterCar = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        List <Car> filterCar = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List <Car> filterCar = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
