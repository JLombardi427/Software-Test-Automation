package java.com.snhu.server;

public class Contact {
/*create variables */
private String contactID;
private String firstName;
private String lastName;
private String streetAddress;
private String phoneNumber;
/*establish length requirements*/


public Contact(String contactID, String firstName, String lastName, String
streetAddress, String phoneNumber) {
if(contactID==null || contactID.length()>10) {
throw new IllegalArgumentException("Invalid ID");
}
if(firstName==null || firstName.length()>10) {
throw new IllegalArgumentException("Invalid First Name");
}
if(lastName==null || lastName.length()>10) {
throw new IllegalArgumentException("Invalid Last Name");
}
if(streetAddress==null || streetAddress.length()>30) {
throw new IllegalArgumentException("Invalid Street Address");
}
if(phoneNumber==null || phoneNumber.length()!=10) {
throw new IllegalArgumentException("Ivalid Phone Number");
}
}
/*Set and Get*/
public String getContactID() {
return contactID;
}
public void setContactID(String contactID) {
this.contactID=contactID;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
	if(firstName==null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid First Name");
		}
this.firstName=firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
	if(lastName==null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid Last Name");
		}
this.lastName=lastName;
}
public String getStreetAddress() {
return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	if(streetAddress==null || streetAddress.length()>30) {
		throw new IllegalArgumentException("Invalid Street Address");
		}
this.streetAddress=streetAddress;
}
public String getPhoneNumber() {
	return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber==null || phoneNumber.length()!=10 && phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Ivalid Phone Number");
			}
	this.phoneNumber=phoneNumber;
	}
	
	}
