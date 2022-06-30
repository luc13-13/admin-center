package com.lc.admin.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lc.admin.center.model.UserRefRoleDO;
import com.lc.admin.center.bo.UserRefRoleBO;
import java.util.List;

/**
 * 用户权限关系表(UserRefRole)表数据库访问层
 *
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Mapper
public interface UserRefRoleDao extends BaseMapper<UserRefRoleDO> {

    List<UserRefRoleDO> queryAllByLimit();
    
    List<UserRefRoleDO> queryAll(UserRefRoleBO bo);
}
