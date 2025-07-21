package com.nl.unit.trace.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nl.unit.trace.bank.entity.BankGroupMasterCR;

@Repository
public interface BankGroupMasterCRRepository extends JpaRepository<BankGroupMasterCR, Long> {

	BankGroupMasterCR findByBankName(String bankName);

}
