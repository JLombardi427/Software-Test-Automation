package java.com.snhu.server;

import org.junit.Assert;

class ContactTest {

void testContact() {
Contact contact=new Contact("C001", "John", "Doe", "123 His St.",
"123456890");
assertTrue(contact.getContactID().equals("C001"));
assertTrue(contact.getFirstName().equals("John"));
assertTrue(contact.getLastName().equals("Doe"));
assertTrue(contact.getStreetAddress().equals("123 His St."));
assertTrue(contact.getPhoneNumber().equals("1234567890"));
}



private void assertTrue(boolean equals) {
	// TODO Auto-generated method stub
	
}



void testContactIDToLong(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C0011111111", "JohnnyBoiDoe", "Doe", "123 His St.",
"1234567890");
}); }

void testContactFirstNameToLong(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C001", "John 111111", "Doe", "123 His St.",
"1234567890");
}); }

void testContactLastNameToLong(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C001", "John", "Doe 1111111", "123 His St.",
"1234567890");
}); }

void testContactStreetAddressToLong(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C001", "John", "Doe", "123 His St.",
"1234567890");
}); }

void testContactPhoneNumberToLong(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C001", "John", "Doe", "123 His St.", "12345678900");
}); }

void testContactPhoneNumberToShort(){
Assert.assertThrows(IllegalArgumentException.class, ()->{
new Contact("C001", "John", "Doe", "123 His St.", "123456789");
}); }
}