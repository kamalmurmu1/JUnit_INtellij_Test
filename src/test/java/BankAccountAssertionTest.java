import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountAssertionTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void TestWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(300);
        assertEquals(200,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400,0);
        bankAccount.deposit(500);
        assertEquals(900,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw will become zero ")
    public void testWIthdrawNotStuckAtZero(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(800);
        assertNotEquals(0,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive(){
        BankAccount bankAccount  = new BankAccount(500,0);
        assertTrue(bankAccount.isActive());

    }

    public void testHolderNameSet(){
        BankAccount bankAccount = new BankAccount(500,0);

    }

}
