/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 *  April 2017
 * 
 *  Class responsible for testing SavingsAccount.java
 */
package banking;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sharon    // add your name here if you worked on it 
 */
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }
    
    /**
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.00;        
        Bank bank = new Bank("BankOfATeam");
        String custId = bank.addCustomer("Piffl", "Hymie");
        Customer cust = bank.getCustomer(custId);
        SavingsAccount account = cust.addSavingsAccount(0.00, "Test account");
        account.deposit(amount);  
        double result = account.getBalance();
        double expResult = 0.00;
        assertTrue(expResult == result);
    }

    /**
     * Test of withdraw method, of class SavingsAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");

    }

    /**
     * Test of addInterestTransaction method, of class SavingsAccount.
     */
    @Test
    public void testAddInterestTransaction() {
        System.out.println("addInterestTransaction");

    }

    /**
     * Test of getDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testGetDefaultInterestRate() {
        System.out.println("getDefaultInterestRate");

    }

    /**
     * Test of setDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testSetDefaultInterestRate() {
        System.out.println("setDefaultInterestRate");

    }
    
}
