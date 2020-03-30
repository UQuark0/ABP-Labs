package me.uquark.abp.labs;

import javax.crypto.Mac;

public class Lab3 {
    private static interface Run {
        void printName();
        int getSpeed();
        int getMass();
        int getPassengers();
        int getWheels();
    }

    private static abstract class Machine implements Run {
        public final int MIN_SPEED = 0;
        public final int MAX_SPEED = -1;
        public final int MIN_PASSENGERS = 0;
        public final int MAX_PASSENGERS = -1;

        public final String name;

        public int currentSpeed = 0;

        public Machine(String name, int currentSpeed) {
            this.name = name;
            this.currentSpeed = currentSpeed;
        }

        @Override
        public void printName() {
            System.out.println(name);
        }
    }

    private static class Motorcycle extends Machine {
        public Motorcycle(String name, int currentSpeed) {
            super(name, currentSpeed);
        }

        @Override
        public int getSpeed() {
            return currentSpeed;
        }

        @Override
        public int getMass() {
            return 150;
        }

        @Override
        public int getPassengers() {
            return 1;
        }

        @Override
        public int getWheels() {
            return 2;
        }
    }

    private static class SportsMotorcycle extends Motorcycle {
        public SportsMotorcycle(String name, int currentSpeed) {
            super(name, currentSpeed);
        }

        @Override
        public int getPassengers() {
            return 0;
        }

        @Override
        public int getMass() {
            return 100;
        }
    }

    private static class Tricycle extends Motorcycle {
        @Override
        public int getWheels() {
            return 3;
        }

        @Override
        public int getPassengers() {
            return 3;
        }

        @Override
        public int getMass() {
            return 200;
        }

        public Tricycle(String name, int currentSpeed) {
            super(name, currentSpeed);
        }
    }

    public static void main(String[] args) {
        SportsMotorcycle sportsMotorcycle = new SportsMotorcycle("Спортывный супэр мотык 228", 120);
        Tricycle tricycle = new Tricycle("Инвалидная коляска с двигателем", 30);

        sportsMotorcycle.printName();
        System.out.print("Масса: ");
        System.out.println(sportsMotorcycle.getMass());
        System.out.print("Скорость: ");
        System.out.println(sportsMotorcycle.getPassengers());
        System.out.print("Кол-во движителей: ");
        System.out.println(sportsMotorcycle.getWheels());
        System.out.print("Кол-во пассажиров: ");
        System.out.println(sportsMotorcycle.getPassengers());

        System.out.println();

        tricycle.printName();
        System.out.print("Масса: ");
        System.out.println(tricycle.getMass());
        System.out.print("Скорость: ");
        System.out.println(tricycle.getPassengers());
        System.out.print("Кол-во движителей: ");
        System.out.println(tricycle.getWheels());
        System.out.print("Кол-во пассажиров: ");
        System.out.println(tricycle.getPassengers());
    }
}
