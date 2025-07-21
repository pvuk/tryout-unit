package com.nl.unit;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ✅ Integration Tests
	Goal: Test how multiple parts of the application work together.
	
	What it tests: Real interaction between components (e.g., service + repository + database).
	Dependencies: Real or in-memory (like H2).
	Speed: Slower than unit tests.
 * 	Example: Testing that BankDetailsService correctly saves and retrieves data from the actual H2 database.
 */
@SpringBootTest
@AutoConfigureTestDatabase
public class BankDetailsIntegrationTest {

//    @Autowired
//    private BankDetailsService service;
//
//    @Test
//    public void testSaveAndRetrieve() {
//        BankDetails details = new BankDetails(...);
//        service.saveDetails(details);
//
//        BankDetails retrieved = service.getDetailsByAccountNumber(details.getAccountNumber());
//        Assertions.assertEquals(details.getAccountHolderName(), retrieved.getAccountHolderName());
//    }
}
