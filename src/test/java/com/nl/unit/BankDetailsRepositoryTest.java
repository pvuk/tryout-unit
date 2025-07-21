package com.nl.unit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Here's a simple example of how to use @DataJpaTest to test your BankDetailsRepository with an actual H2 in-memory database in a Spring Boot project.
 * 
 * ✅ What @DataJpaTest Does
	Loads only JPA-related components (like repositories).
	Uses H2 in-memory database by default.
	Rolls back transactions after each test (keeps tests isolated).
	Fast and lightweight compared to full @SpringBootTest.
 */
@DataJpaTest
public class BankDetailsRepositoryTest {

//    @Autowired
//    private BankDetailsRepository repository;
//
//    @Test
//    public void testSaveAndFindByAccountNumber() {
//        BankDetails details = new BankDetails();
//        details.setAccountHolderName("Alice");
//        details.setAccountNumber("111222333");
//        details.setBankName("Test Bank");
//
//       .findByAccountNumber("111222333");
//
//        assertThat(found).isPresent();
//        assertThat(found.get().getAccountHolderName()).isEqualTo("Alice");
//    }
}
