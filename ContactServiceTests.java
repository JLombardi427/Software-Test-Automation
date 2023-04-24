package java.com.snhu.server;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

void testAddMethod() {
ContactService cs=new ContactService();
Contact c1=new Contact("C001", "Justin", "Doe", "123 His St.",
"1234567890");
Contact c2=new Contact("C002", "Julie", "Doe", "456 Her St.",
"9876543210");
Contact c3=new Contact("C003", "JustinandJules", "Does", "789 Their St.",
"9873216540");
assertTrue(cs.add(c1));
assertTrue(cs.add(c2));
assertTrue(cs.add(c3));
}
/*testing the AddMethod when it shouldn't work*/

private void assertTrue(boolean add) {
	// TODO Auto-generated method stub
	
}

void testMethodAddFail() {
Assert.assertThrows(IllegalArgumentException.class, ()->{
Contact.add("C002");
Contact.add("C002");
}); }
/*test the delete method*/

void testMethodDeleteFail() {
Assert.assertThrows(IllegalArgumentException.class, ()->{
Contact.remove("C004");
}); }

void testMethodDeletePass() {
Contact.remove("C002");
}
/*test the update method*/

void testUpdateFail() {
Assert.assertThrows(IllegalArgumentException.class, ()->{
Contact.update("C004", "Dan", "Jam", "123 His St.", "1234567890");
}); }

void TestUpdatePass() {
Contact.update("C001", "Jack", "Black", "456 His St.s", "1234567890");
}
}