package edu.kits.finalproject.Service.impl;

import edu.kits.finalproject.Entity.User;
import edu.kits.finalproject.Repository.UserRepository;
import edu.kits.finalproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return userRepository.saveAndFlush(entity);
    }

    @Override
    public int updateTokenById(String token, Long id) {
        return userRepository.updateTokenById(token, id);
    }

    @Override
    public User findByToken(String token){
        return userRepository.findByToken(token);
    }
}
