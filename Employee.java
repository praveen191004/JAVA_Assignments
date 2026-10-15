package javasample;

public class Employee {

    static int count = 0; 

    void register() {
        count++; 
    }


    public static void main(String[] args) {
   
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.register();
        emp2.register();
        emp3.register();

        System.out.println("Total registered: " + Employee.count); 
    }
}
