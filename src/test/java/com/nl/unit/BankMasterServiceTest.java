package com.nl.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nl.unit.trace.bank.entity.BankMasterCR;
import com.nl.unit.trace.bank.repository.BankMasterCRRepository;
import com.nl.unit.trace.bank.service.impl.BankMasterCRServiceImpl;

/**
 * ✅ Unit Tests
	Goal: Test a single unit of code in isolation (usually a method or class).
	
	What it tests: Just the logic of one class or method.
	Dependencies: Mocked using tools like Mockito.
	Speed: Very fast.
	Example: Testing BankDetailsService.getDetailsByAccountNumber() by mocking the repository.
	
	<b>*** You're not connecting to the database here — you're just checking if the service behaves correctly when the repository returns certain values.</b>
 */
@ExtendWith(MockitoExtension.class)
public class BankMasterServiceTest {
	@Mock
	private BankMasterCRRepository repository;// Mocked dependency

	@InjectMocks
	private BankMasterCRServiceImpl serviceImpl;// Class under test with mocked dependencies injected

	@Test
	public void testGetBankMasterCRByIfscCode() {
		String ifscCode = "APBL0000001";
		//Arrange
		when(repository.findAllByIfscCode(ifscCode)).thenReturn(BankMasterCR.builder().build());//APBL0000001
		
		//Act
		BankMasterCR result = serviceImpl.findAllByIfscCode(ifscCode);
		
		//Assert
		assertEquals(BankMasterCR.builder().build(), result);
	}
//	
//	@Test
//	public void testGetBankMasterCRList() {
//		//Arrange
//		when(repository.findAllByBankMasterCrID(1L)).thenReturn(null);
//		
////		Name(1);
//		
//		//Assert
//		assertEquals("Mocked User", null);
//	}
}
