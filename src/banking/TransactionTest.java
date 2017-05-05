package banking;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

/**
 * @author Flavio Luis, Sharon Tender, Frank Castillo
 *	This test accounts for two types of eventualities: transactions made by two parties,
 *  and transactions made by a single party (assumed to be the bank). This test assumes
 *  that interest payments, fees, penalties, and adjustments is money that comes "from
 *  thin air," but in a real world situation, such funds would come from somewhere within
 *  the institution.
 */
public class TransactionTest {

	/*
	 * Testing a transaction involving two parties
	 */

	@Test
	public void testTwoPartyTrnx() {
		// General account information
		System.out.println("Making New Two-Party Transaction");
		TransactionType dbtTrnxType = TransactionType.WITHDRAWAL;
		TransactionType cdtTrnxType = TransactionType.DEPOSIT;
		double trnxAmnt = 10.00;
		String trnxDesc = "This is a description of the transactionn from John Smith to James Jones";
		
		// Transaction debit information
		Bank testDbtBank = new Bank("BankOfATeam");
		String testDbtLName = "Smith";
		String testDbtFName = "John";
		Customer testDbtCust = new Customer(testDbtBank, testDbtLName, testDbtFName);
		SavingsAccount testDbtAcct = new SavingsAccount(testDbtCust, 0.00, "Account of John Smith");
		Transaction dbtTrnx = new Transaction(dbtTrnxType, trnxAmnt, trnxDesc);
		testDbtAcct.transactions.add(dbtTrnx);
		
		// Transaction credit information
		Bank testCdtBank = new Bank("BankOfBTeam");
		String testCdtLName = "Jones";
		String testCdtFName = "James";
		Customer testCdtCust = new Customer(testCdtBank, testCdtLName, testCdtFName);
		SavingsAccount testCdtAcct = new SavingsAccount(testCdtCust, 0.00, "Account of John Smith");
		Transaction cdtTrnx = new Transaction(cdtTrnxType, trnxAmnt, trnxDesc);
		testCdtAcct.transactions.add(cdtTrnx);
		
	}
	
	/*
	 * Testing a transaction involving only one party.
	 */
	
	@Test
	public void testOnePartyTrnx() {
		// General account information
		System.out.println("Making New One-Party Transaction");
		TransactionType interest = TransactionType.INTEREST;
		TransactionType fee = TransactionType.FEE;
		TransactionType penalty = TransactionType.PENALTY;
		TransactionType adjustment = TransactionType.ADJUSTMENT;

		// One-party information
		Bank testBank = new Bank("BankOfATeam");
		String testLName = "Johnson";
		String testFName = "Jim";
		Customer testCust = new Customer(testBank, testLName, testFName);
		SavingsAccount testAcct = new SavingsAccount(testCust, 0.00, "Account of Jim Johnson");
		
		// Transactions
		Transaction interestTrnx = new Transaction(interest, 5.00, "Interest Payment");
		testAcct.transactions.add(interestTrnx);
		
		Transaction feeTrnx = new Transaction(fee, -10.00, "Fee Charge");
		testAcct.transactions.add(feeTrnx);
		
		Transaction penaltyTrnx = new Transaction(penalty, -15.00, "Penalty Charge");
		testAcct.transactions.add(penaltyTrnx);
		
		Transaction adjustmentTrnx = new Transaction(adjustment, 20.00, "Adjustment Payment");
		testAcct.transactions.add(adjustmentTrnx);
		
	}
}