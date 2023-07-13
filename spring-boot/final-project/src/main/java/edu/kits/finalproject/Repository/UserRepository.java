package edu.kits.finalproject.Repository;

import edu.kits.finalproject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users u WHERE u.username = :username LIMIT 1", nativeQuery = true)
    User findByUsername(String username);

//    @Modifying
//    @Query(value = "UPDATE users SET token = :token WHERE id = :id", nativeQuery = true)
//    void updateTokenById(Long id, String token);

    @Modifying
    @Transactional
    @Query(value = "UPDATE users u SET u.token = ? WHERE u.user_id = ?", nativeQuery = true)
    int updateTokenById(String token, Long id);

    @Query(value = "SELECT * FROM users u WHERE u.token = :token ", nativeQuery = true)
    User findByToken(String token);
}
