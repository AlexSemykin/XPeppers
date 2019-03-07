package ReplaceMethodWithMethodObject;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void calculateGammaWithImportantValue2Alterated() {
        Account account = new Account();

        assertEquals(71195,account.gamma(5,3,2019));
    }

    @Test
    public void calculateGammaWithImportantValue2NotAlterated() {
        Account account = new Account();

        assertEquals(14129700,account.gamma(1000,2,2019));
    }

}