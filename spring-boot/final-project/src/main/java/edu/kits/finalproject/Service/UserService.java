package edu.kits.finalproject.Service;

import edu.kits.finalproject.Entity.User;

public interface UserService {
    User findByUsername(String username);

    <S extends User> S saveAndFlush(S entity);

    int updateTokenById(String token, Long id);

    User findByToken(String token);
}