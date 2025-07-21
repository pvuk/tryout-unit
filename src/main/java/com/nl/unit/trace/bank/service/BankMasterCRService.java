package com.nl.unit.trace.bank.service;

import com.nl.unit.trace.bank.entity.BankMasterCR;

public interface BankMasterCRService {

	BankMasterCR findAllByIfscCode(String ifscCode);

}
