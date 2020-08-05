package com.lucas.blog.service;

import com.lucas.blog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cgm
 * @since 2020-08-04
 */
@Service
public interface UserService extends IService<User> {
    /**
     * @Author cgm
     * @Description //获取用户列表信息
     * @Date 13:07 2020/8/4
     * @Param []
     * @return java.util.List<com.lucas.blog.entity.User>
     **/
    List<User> getUserList();
}
