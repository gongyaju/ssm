package com.ssm.service;


import com.ssm.pojo.User;
import com.ssm.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/22.
 */
@Repository
public interface IUserService {

    User getUserById(int userId);

    int createUser(User user);

    User findByLogin(User user);

    Page<User> findByParams(User u, int pageNo, int limit);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int findAllCount(User u);

    List<User> findHotUser();

    List<User> findAllByQuery(User user);

    /**
     * 分页查询
     *
     * @param map
     * @return
     */
    List<User> list(Map<String, Object> map);

    Long getTotal(Map<String, Object> map);


    /**
     * Shiro的登录验证，通过用户名查询用户信息
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);

}
