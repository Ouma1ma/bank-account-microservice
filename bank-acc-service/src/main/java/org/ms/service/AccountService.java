package org.ms.service;

import org.ms.dto.BankAccountRequestDTO;
import org.ms.dto.BankAccountResponseDTO;
import org.ms.entities.BankAccount;
import org.ms.enums.AccountType;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
