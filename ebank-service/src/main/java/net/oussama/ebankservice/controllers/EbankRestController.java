package net.oussama.ebankservice.controllers;

import net.oussama.ebankservice.Repository.BankAccountRepository;
import net.oussama.ebankservice.entities.BankAccount;
import net.oussama.ebankservice.service.EbankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EbankRestController {
    private EbankService ebankService;

    public EbankRestController(EbankService ebankService) {
        this.ebankService = ebankService;
    }
    @GetMapping("/accounts")
    private List<BankAccount> getAllBankAccounts() {
        return ebankService.getAllBankAccounts();
    }
    @GetMapping("/accounts/{id}")
    private BankAccount getBankAccountByTd(@PathVariable String id){
        return ebankService.getBankAccountByTd(id);
    }
    @PostMapping("/accounts")
    private BankAccount save(@RequestBody BankAccount bankAccount){
        return ebankService.save(bankAccount);
    }
}
