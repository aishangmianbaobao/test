package com.lucas.blog.service.impl;

import com.lucas.blog.entity.User;
import com.lucas.blog.mapper.UserMapper;
import com.lucas.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cgm
 * @since 2020-08-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(null);
    }
}
