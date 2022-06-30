package com.lc.admin.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.bo.UserBO;
import java.util.List;

/**
 * 顾客账号信息表(User)表数据库访问层
 *
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Mapper
public interface UserDao extends BaseMapper<UserDO> {

    List<UserDO> queryAllByLimit();
    
    List<UserDO> queryAll(UserBO bo);
}
