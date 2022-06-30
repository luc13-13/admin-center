package com.lc.admin.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lc.admin.center.model.RoleRefPermissionDO;
import com.lc.admin.center.bo.RoleRefPermissionBO;
import java.util.List;

/**
 * 角色权限关系表(RoleRefPermission)表数据库访问层
 *
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Mapper
public interface RoleRefPermissionDao extends BaseMapper<RoleRefPermissionDO> {

    List<RoleRefPermissionDO> queryAllByLimit();
    
    List<RoleRefPermissionDO> queryAll(RoleRefPermissionBO bo);
}
