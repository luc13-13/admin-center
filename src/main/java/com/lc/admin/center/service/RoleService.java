package com.lc.admin.center.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.admin.center.model.RoleDO;
import com.lc.admin.center.web.request.PageRequest;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 权限表(Role)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
public interface RoleService extends IService<RoleDO> {

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    List<RoleDO> getRoleDOListPage(PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param roleDO 实例对象
     * @return 实例对象
     */
    RoleDO creatOrUpdate(RoleDO roleDO);

    /**
     * 修改数据
     *
     * @param roleDO 实例对象
     * @return 实例对象
     */
    RoleDO updateRoleDO(RoleDO roleDO);

    /**
     * 物理删除
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * @param loginName 用户登陆账号
     * @return 获取 loginName 拥有的角色列表
     */
    public Set<String> getUserRoles(String loginName);

}
