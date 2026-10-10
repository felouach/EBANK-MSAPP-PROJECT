package net.oussama.ebankservice.service;

import net.oussama.ebankservice.Repository.BankAccountRepository;
import net.oussama.ebankservice.entities.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbankService {
    private BankAccountRepository accountRepository;

    public EbankService(BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public List<BankAccount> getAllBankAccounts() {
        return accountRepository.findAll();
    }
    public BankAccount getBankAccountByTd(String id){
        return accountRepository.findById(id).orElseThrow(()->new RuntimeException("BankAccount not found"));
    }
    public BankAccount save(BankAccount bankAccount){
        return accountRepository.save(bankAccount);
    }
}
