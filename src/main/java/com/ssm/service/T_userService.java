package com.ssm.service;


import com.ssm.pojo.T_user;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created with IDEA
 * Created by Requiem on 2016/7/14.
 * 后台登录Service
 */
@Repository
public interface T_userService {
    /**
     * Shiro的登录验证，通过用户名查询用户信息
     *
     * @param username
     * @return
     */
    T_user findUserByUsername(String username);

    /**
     * 根据账号查找角色名称
     *
     * @param username
     * @return
     */
    Set<String> findRoles(String username);

    /**
     * 根据账号查找权限
     *
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
}
