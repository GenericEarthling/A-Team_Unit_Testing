
/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 *  April 2017
 * 
 *  Class responsible for testing Account.java
 */
package banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sharon    // add your name here if you worked on it too!
 */
public class AccountTest {
    
    public AccountTest() {
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        final String lastName = "Doe";
        final String firstName = "Jane";
        double amount = 0.00;
        Bank bank = new Bank("Test Bank");
        Customer customer = new Customer(bank, lastName, firstName);
        Account account = new SavingsAccount(customer, amount, "description");
        account.deposit(amount);                          // don't know where to go from here                            
        double expResult = 0.00;
        assertTrue(expResult == amount);
        assertFalse("Deposit does not equal 0: ", amount != 0.00);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");

    }

    /**
     * Test of transfer method, of class Account.
     */
    @Test  // sharon
    public void testTransfer() {
        System.out.println("transfer");
        final String lastName = "Doe";
        final String firstName = "Jane";
        final String lastName2 = "Dont";
        final String firstName2 = "John";
        double amount = 0.00;
        Bank bank = new Bank("Test Bank");
        Customer fromCustomer = new Customer(bank, lastName, firstName);
        Customer toCustomer = new Customer(bank, lastName2, firstName2);
        Account fromAccount = new SavingsAccount(fromCustomer, amount, "description");
        Account toAccount = new SavingsAccount(toCustomer, amount, "description");
        banking.Account.transfer(fromAccount, toAccount, amount);
        assertTrue(fromAccount != toAccount);
    }
  
  /*
  	@Test  // Flavio
	public void testTranfer() {
		Bank bank = new Bank("New Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		Account account1 = new SavingsAccount(cust, 100.00, "Savings");
		Account account2 = new SavingsAccount(cust, 50.00, "Checking");
		final double result = 150.00;
		final double DELTA = 1E-5;
		Account.transfer(account2, account1, 50.00);
		assertEquals(result, account1.getBalance(), DELTA);
		
		fail("Not yet implemented");
	}
  */

    /**
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");

    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

    }

    /**
     * Test of compareTo method, of class Account.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");

    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

    }

}   


