package com.liy.bootliy.dao;

import com.liy.bootliy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/24 0024
 */
@Transactional
public interface UserDao extends JpaRepository<User,Integer> {

}
