package com.lc.admin.center.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.admin.center.model.RoleDO;
import com.lc.admin.center.mapper.RoleDao;
import com.lc.admin.center.service.RoleService;
import com.lc.admin.center.web.request.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 权限表(Role)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao,RoleDO> implements RoleService {
    
    @Autowired
    private RoleDao roleDao;
    

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    public List<RoleDO> getRoleDOListPage(PageRequest pageRequest){
        return null;
    }

    /**
     * 新增数据
     *
     * @param roleDO 实例对象
     * @return 实例对象
     */
    public RoleDO creatOrUpdate(RoleDO roleDO) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param roleDO 实例对象
     * @return 实例对象
     */
    public RoleDO updateRoleDO(RoleDO roleDO) {
        return null;
    }

    /**
     * 物理删除
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Long id) {
        return true;
    }

    @Override
    public Set<String> getUserRoles(String loginName) {
        Page<RoleDO> page = new Page<>();
        QueryWrapper queryWrapper = new QueryWrapper();

        return null;
    }
}
