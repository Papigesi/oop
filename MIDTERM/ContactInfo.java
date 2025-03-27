
package Midterm;

public class ContactInfo {
    
    private String homeAddress ;
    private String telNumber ;
    private String eMail ;
    
    public ContactInfo() {
        homeAddress = null ;
        telNumber = null ;
        eMail = null ;
    }
    
    public ContactInfo(String newHomeAddress, String newTelNumber, String newEMail) {
        homeAddress = newHomeAddress ;
        telNumber = newTelNumber ;
        eMail = newEMail ;    
    }
    
    public ContactInfo(ContactInfo originalObject) {
        homeAddress = originalObject.homeAddress ;
        telNumber = originalObject.telNumber ;
        eMail = originalObject.eMail ;
    }
    
    public String getHomeAddress() {
        return homeAddress ;
    }
    
    public void setHomeAddress(String theHomeAddress) {
        homeAddress = theHomeAddress ;
    }
    
    public String getTelNumber() {
        return telNumber ;
    }
    
    public void setTelNumber(String theTelNumber) {
        telNumber = theTelNumber ;
    }
    
    public String getEMail() {
        return eMail ;
    }
    
    public void setEMail(String theEMail) {
        eMail = theEMail ;
    }
    
    @Override
    public String toString() {
        return ("Home Address: " + homeAddress + " \nTel Number: " + telNumber + " \nE-Mail: " + eMail) ;
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
            ContactInfo otherContactInfo = (ContactInfo)other ;
            return (homeAddress.equals(otherContactInfo.homeAddress)
                    && telNumber.equals(otherContactInfo.telNumber)
                    && eMail.equals(otherContactInfo.eMail)) ;
        }
    }
}
