package org.ms.service;

import org.ms.dto.BankAccountRequestDTO;
import org.ms.dto.BankAccountResponseDTO;
import org.ms.entities.BankAccount;
import org.ms.mappers.AccountMapper;
import org.ms.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=accountMapper.toBankAccount(bankAccountDTO);
        BankAccount savedBankAcc = bankAccountRepository.save(bankAccount);
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(savedBankAcc);
        return bankAccountResponseDTO;
    }
}
