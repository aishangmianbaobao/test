package com.lucas.blog.mapper;

import com.lucas.blog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cgm
 * @since 2020-08-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
