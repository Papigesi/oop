package Midterm ;

public class Bus extends Vehicle {
    private int capacity ;
    private int ageOfBus ;
    
    public Bus() {
        super () ;
        capacity = 0 ;
        ageOfBus = 0 ;
    }
    
    public Bus(String brand, String licensePlate, Person owner, int theCapacity, int theAgeOfBus) {
        super(brand, licensePlate, owner) ;
        capacity = theCapacity ;
        ageOfBus = theAgeOfBus ;
    }
    
    public Bus(Bus originalObject) {
        super(originalObject) ;
        capacity = originalObject.capacity ;
        ageOfBus = originalObject.ageOfBus ;
    }
    
    public int getCapacity() {
        return capacity ;
    }
    
    public void setCapacity(int newCapacity) {
        capacity = newCapacity ;
    }
    
    public int getAgeOfBus() {
        return ageOfBus ;
    }
    
    public void setAgeOfBus(int newAgeOfBus) {
        ageOfBus = newAgeOfBus ;
    }
    
    public int calculateTax() {
        int tax  ;
        if (ageOfBus < 5) {
            tax = 4000 ;
        }
        else if (ageOfBus <= 10) {
            tax = 3000 ;
        }
        else {
            tax = 2000 ;
        }
        return tax ;
    }
    
    @Override
    public String toString() {
        return (super.toString() + " \nCapacity: " + capacity + " \nAge Of Bus: " + ageOfBus) ;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false ;
        }
        else if (getClass() != other.getClass()) {
            return false ;
        }
        else {
            Bus otherBus = (Bus)other ;
            return(capacity == otherBus.capacity
                    && ageOfBus == otherBus.ageOfBus
                    && super.equals(otherBus)) ;
        }
    }
}
