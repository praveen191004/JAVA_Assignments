package Assignments;

public class ElectricityBill2 {

    double energyCharge;
    double fixedCharge;
    double finalBill;

    double calculateBill(int units) {

        if (units <= 100) {
            return units * 2;
        } else if (units <= 200) {
            return (100 * 2) + ((units - 100) * 3);
        } else {
            return (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
    }

    double addFixedCharge(double billAmount) {
        return billAmount + 50;
    }

    void displayBill() {
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {

        ElectricityBill2 e = new ElectricityBill2();

        int units = 250;

        e.energyCharge = e.calculateBill(units);
        e.fixedCharge = 50;
        e.finalBill = e.addFixedCharge(e.energyCharge);

        e.displayBill();
    }
}

