package innerclasses_pack;

import java.sql.SQLOutput;

public class ElectroCar {
    private int id;

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();
        someClassMethod(someClass);

        System.out.println("Car \"" + this.id + "\" is starting");
    }

    private void someClassMethod(Object obj) {

    }

    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting");
        }
    }

    //Статический вложенный класс
    public static class Battary {
        public void charge() {
            System.out.println("The battary is charging");
        }
    }

}
