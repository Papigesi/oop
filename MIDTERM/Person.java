
package Midterm;

public class Person {
    private String name ;
    private ContactInfo contactInformation ;
    
    public Person() {
        name = null ;
        contactInformation = null ;
    }
    
    public Person(String theName, ContactInfo theContactInformation) {
        name = theName ;
        contactInformation = new ContactInfo(theContactInformation) ;
    }
    
    public Person(Person originalObject) {
        name = originalObject.name ;
        contactInformation = new ContactInfo(originalObject.contactInformation) ;
    }
    
    public String getName() {
        return name ;
    }
    
    public void setName(String theName) {
        name = theName ;
    }
    
    public ContactInfo getContactInformation() {
        return new ContactInfo(contactInformation) ;
    }
    
    public void setContactInformation(ContactInfo theContactInformation) {
        contactInformation = new ContactInfo(theContactInformation) ;
    }
    
    @Override
    public String toString() {
        return ("Name: " + name + " \n" + contactInformation.toString()) ;
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
            Person otherPerson = (Person)other ;
            return(name.equals(otherPerson.name)
                    && contactInformation.equals(otherPerson.contactInformation)) ;
        }
    }
}
