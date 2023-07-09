package edu.kits.finalproject.Service.impl;

import edu.kits.finalproject.Domain.Account;
import edu.kits.finalproject.Repository.AccountRepository;
import edu.kits.finalproject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public <S extends Account> S saveAndFlush(S entity) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return accountRepository.saveAndFlush(entity);
    }

    @Override
    public Account findByEmail(String email){
        return accountRepository.findByEmail(email);
    }

    //    public UserServiceImpl() {
////        store.add(new User(UUID.randomUUID().toString(), "Durgesh Tiwari", "durgesh@dev.in"));
////        store.add(new User(UUID.randomUUID().toString(), "Harsh Tiwari", "harsh@dev.in"));
////        store.add(new User(UUID.randomUUID().toString(), "Ankit Tiwari", "ankit@dev.in"));
////        store.add(new User(UUID.randomUUID().toString(), "Gautam Shukla", "gutam@dev.in"));
//    }


}
