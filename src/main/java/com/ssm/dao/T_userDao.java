package com.ssm.dao;


import com.ssm.pojo.T_user;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created with IDEA
 * Created by Requiem on 2016/7/14.
 */
@Repository
public interface T_userDao {
    T_user findUserByUsername(String username);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);
}
