package innerclasses_pack;

public class InnerClassMain {
    public static void main(String[] args) {
        ElectroCar electroCar1 = new ElectroCar(1);
        electroCar1.start();

        ElectroCar.Battary battary = new ElectroCar.Battary();
        battary.charge();
    }
}
