
package Midterm;

public class Demo {
    
    public static void main(String[] args) {
        
        ContactInfo somebody = new ContactInfo("New York", "9523802197", "Ist9523802@gmail.com") ;
        Person individual = new Person("Joel Parkinson", somebody) ;
        Bus autobus = new Bus("BMC", "111MBB", individual, 15, 2) ;
        
        System.out.println(autobus) ;
        System.out.println("Tax: " + autobus.calculateTax()) ;
        
        Bus autoBusCopy = new Bus(autobus) ;
        
        System.out.println("Are the Bus objects equal? " + autobus.equals(autoBusCopy));
    }
}
