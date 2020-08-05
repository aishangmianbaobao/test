package com.lucas.blog.controller;


import com.lucas.blog.entity.User;
import com.lucas.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cgm
 * @since 2020-08-04
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Author cgm
     * @Description //获取用户列表信息
     * @Date 13:06 2020/8/4
     * @Param []
     * @return java.util.List<com.lucas.blog.entity.User>
     **/
    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }

}

