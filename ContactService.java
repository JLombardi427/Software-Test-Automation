package java.com.snhu.server;

import java.util.ArrayList;
public class ContactService {
/*a list of contacts*/
private ArrayList<Contact> contacts;
/*constructor*/
public ContactService() {
contacts=new ArrayList<>();
}
/*method to add a contact to the list if not already created*/
public boolean add(Contact contact) {
/*find out if contact is existing contact*/
boolean existingContact=false;
for(Contact c:contacts) {
if(c.equals(contact)) {
existingContact=true;
}
}
/*if the contact is not existing, add it and return true*/
if(!existingContact) {
contacts.add(contact);
System.out.println("Contact Created Successfully!");
return true;
}else {
System.out.println("Contact already created");
return false;
}
}
/*method to remove a contact*/
public boolean remove(String contactID) {
for(Contact c:contacts) {
if(c.getContactID().equals(contactID)) {
contacts.remove(c);
System.out.println("Contact removed Successfully!");
return true;
}
}
System.out.println("Contract not found");
return false;
}
/*method to update contactID's firstName, lastName, streetAddress, and
phoneNumber*/
public boolean update(String contactID, String firstName, String lastName,
String streetAddress, String phoneNumber) {
for(Contact c:contacts) {
if(c.getContactID().equals(contactID)) {
if(!firstName.equals(""))
c.setFirstName(firstName);
if(!lastName.equals(""))
c.setLastName(lastName);
if(!streetAddress.equals(""))
c.setStreetAddress(streetAddress);
if(!phoneNumber.equals(""))
c.setPhoneNumber(phoneNumber);
System.out.println("Contact updated Successfully!");
return true;
}
}
System.out.println("Contact not found");
return false;
}
public boolean updateContactFirstName(String contactID, String firstName) {
	for(Contact c:contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!firstName.equals(""))
			c.setFirstName(firstName);
	}
	}
	return false;
	
} 

public boolean updateContactLastName(String contactID, String lastName) {
	for(Contact c:contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!lastName.equals(""))
			c.setLastName(lastName);
	}
	}
	return false;
	
} 

public boolean updateContactPhone(String contactID, String number) {
	for(Contact c:contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!number.equals(""))
			c.setPhoneNumber(number);
	}
	}
	return false;
	
}

public boolean updateContactAddress(String contactID, String address) {
	for(Contact c:contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!address.equals(""))
			c.setStreetAddress(address);
	}
	}
	return false;
	
} 
}
