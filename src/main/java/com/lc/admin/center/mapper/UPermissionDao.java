package com.lc.admin.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lc.admin.center.model.UPermissionDO;
import com.lc.admin.center.bo.UPermissionBO;
import java.util.List;

/**
 * 操作权限表(UPermission)表数据库访问层
 *
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Mapper
public interface UPermissionDao extends BaseMapper<UPermissionDO> {

    List<UPermissionDO> queryAllByLimit();
    
    List<UPermissionDO> queryAll(UPermissionBO bo);
}
