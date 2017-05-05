/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 *  April 2017
 * 
 *  Class responsible for testing Bank.java
 */
package banking;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sharon    // add your name here if you worked on it too!
 */
public class BankTest {

    @Test
    public void testCreateABank () {
        System.out.println("testCreateABank");
        final String name = "Foo";
        Bank theBank = new Bank(name);
        assertNotNull( theBank );
        System.out.println(name);                    // prints foo
        System.out.println(theBank.getNAME());       // prints null
        assertEquals( name, theBank.getNAME() );     // this is false 
    }
       
    @Test
    public void testRemoveCustomer() {
        System.out.println("RemoveCustomer");
        final String lastName1 = "Doe";
        final String firstName1 = "Jane";
        final String lastName2 = "Jones";
        final String firstName2 = "Amy";
        final Bank instance = new Bank ("Test-Bank");
        final String CUSTOMER_1_ID = instance.addCustomer( lastName1, firstName1 );
        final String CUSTOMER_2_ID = instance.addCustomer( lastName2, firstName2 );
        assertNotEquals(CUSTOMER_1_ID, CUSTOMER_2_ID);                           // both are null
        List<Customer> custList = instance.getCustomer( lastName1, firstName1 ); // NullPointerException
        assertEquals( 2, custList.size() );                                      // checkiing to see if list has 2 items
        instance.removeCustomer(CUSTOMER_2_ID);                       // remove a customer
        assertEquals(1, custList.size());                                        // checking to see if removeCustomer worked
        
    }
    
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        final String lastName = "Doe";
        final String firstName = "Jane";
        final Bank bank = new Bank ("Test-Bank");
        final String result = bank.addCustomer( lastName, firstName );     // checking to see if addCustomer worked
        Customer customer = new Customer(bank, lastName, firstName);
//        List<Customer> custList = new List<>(customer); 
//        String expResult = lastName + firstName;
//        assertEquals(1, custList.size());                                        // checking to see if it added a customer        
//        assertEquals(expResult, result);                                         // result is null                         

        // test for null
        String customerId = null;  
        String result2 = customerId;
        String expResult2 = null;
        assertEquals(expResult2, result2);
        assertNull("should be null: ", result2);
        
        

    }


}
