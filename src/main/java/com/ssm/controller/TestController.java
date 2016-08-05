package com.ssm.controller;


import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    private Logger logger = Logger.getLogger(TestController.class);
    @Resource
    private IUserService userService;//userService实现类的@Service("userService")  @Resource和@Repository配对使用 生成实例

    @ResponseBody
    @RequestMapping("/test")
    public User test(int id) {
        logger.info(id);
        User user = userService.getUserById(id);
        return user;
    }


}
