
package Midterm;

public abstract class Vehicle {
    
    private String brand ;
    private String licensePlate ;
    private Person owner ;
    
    public Vehicle() {
        brand = null ;
        licensePlate = null ;
        owner = new Person(null) ;
    }
    
    public Vehicle(String theBrand, String theLicensePlate, Person theOwner) {
        brand = theBrand ;
        licensePlate = theLicensePlate ;
        owner = new Person(theOwner) ;
    }
    
    public Vehicle(Vehicle originalObject) {
        brand = originalObject.brand ;
        licensePlate = originalObject.licensePlate ;
        owner = new Person(originalObject.owner) ;
    }
    
    public String getBrand() {
        return brand ;
    }
    
    public void setBrand(String newBrand) {
        brand = newBrand ;
    }
    
    public String getLicensePlate() {
        return licensePlate ;
    }
    
    public void setLicensePlate(String newLicensePlate) {
        licensePlate = newLicensePlate ;
    }
    
    public Person getOwner() {
        return new Person(owner) ;
    }
    
    public void setOwner(Person newOwner) {
        owner = new Person(newOwner) ;
    }
    
    @Override
    public String toString() {
        return ("Brand: " + brand + " \nLicense Plate: " + licensePlate + " \nOwner " + owner.toString()) ;
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
            Vehicle otherVehicle = (Vehicle)other ;
            return(brand.equals(otherVehicle.brand)
                    && licensePlate.equals(otherVehicle.licensePlate)
                    && owner.equals(otherVehicle.owner)) ;
        }
    }
    
    public abstract int calculateTax() ;
}
