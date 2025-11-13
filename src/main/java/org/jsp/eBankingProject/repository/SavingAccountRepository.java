package org.jsp.eBankingProject.repository;

import org.jsp.eBankingProject.entity.SavingBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingBankAccount, Long> {

}