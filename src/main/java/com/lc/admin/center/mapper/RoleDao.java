package com.lc.admin.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lc.admin.center.model.RoleDO;
import com.lc.admin.center.bo.RoleBO;
import java.util.List;

/**
 * 权限表(Role)表数据库访问层
 *
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Mapper
public interface RoleDao extends BaseMapper<RoleDO> {

    List<RoleDO> queryAllByLimit();
    
    List<RoleDO> queryAll(RoleBO bo);
}
