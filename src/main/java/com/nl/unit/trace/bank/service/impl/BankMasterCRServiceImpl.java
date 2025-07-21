package com.nl.unit.trace.bank.service.impl;

import com.nl.unit.trace.bank.entity.BankMasterCR;
import com.nl.unit.trace.bank.repository.BankMasterCRRepository;
import com.nl.unit.trace.bank.service.BankMasterCRService;

public class BankMasterCRServiceImpl implements BankMasterCRService {

	private final BankMasterCRRepository bankMasterCRRepository;
	public BankMasterCRServiceImpl(BankMasterCRRepository bankMasterCRRepository) {
		this.bankMasterCRRepository = bankMasterCRRepository;
	}
	
	@Override
	public BankMasterCR findAllByIfscCode(String ifscCode) {
		return bankMasterCRRepository.findAllByIfscCode(ifscCode);
	}

}
