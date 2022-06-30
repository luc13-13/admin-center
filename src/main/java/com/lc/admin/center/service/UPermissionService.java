package com.lc.admin.center.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.admin.center.model.UPermissionDO;
import com.lc.admin.center.web.request.PageRequest;

import java.util.List;
import java.util.Set;

/**
 * 操作权限表(UPermission)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
public interface UPermissionService extends IService<UPermissionDO> {

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    List<UPermissionDO> getUPermissionDOListPage(PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param uPermissionDO 实例对象
     * @return 实例对象
     */
    UPermissionDO creatOrUpdate(UPermissionDO uPermissionDO);

    /**
     * 修改数据
     *
     * @param uPermissionDO 实例对象
     * @return 实例对象
     */
    UPermissionDO updateUPermissionDO(UPermissionDO uPermissionDO);

    /**
     * 物理删除
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    Set<String> getUserPermissions(String loginName);


}
