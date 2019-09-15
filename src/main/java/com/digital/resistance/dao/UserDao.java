package com.digital.resistance.dao;

import com.digital.resistance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    User findUserByPhone(String phone);
}
