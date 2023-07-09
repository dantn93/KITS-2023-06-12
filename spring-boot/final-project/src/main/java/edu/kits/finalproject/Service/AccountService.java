package edu.kits.finalproject.Service;

import edu.kits.finalproject.Domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();


    <S extends Account> S saveAndFlush(S entity);

    public Account findByEmail(String email);
}
