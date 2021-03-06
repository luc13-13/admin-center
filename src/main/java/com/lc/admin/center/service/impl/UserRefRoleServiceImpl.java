package com.lc.admin.center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.admin.center.model.UserRefRoleDO;
import com.lc.admin.center.mapper.UserRefRoleDao;
import com.lc.admin.center.service.UserRefRoleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.lc.admin.center.web.request.PageRequest;
import java.util.List;
/**
 * 用户权限关系表(UserRefRole)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Service
public class UserRefRoleServiceImpl extends ServiceImpl<UserRefRoleDao,UserRefRoleDO> implements UserRefRoleService {
    
    @Autowired
    private UserRefRoleDao userRefRoleDao;
    

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    public List<UserRefRoleDO> getUserRefRoleDOListPage(PageRequest pageRequest){
        return null;
    }

    /**
     * 新增数据
     *
     * @param userRefRoleDO 实例对象
     * @return 实例对象
     */
    public UserRefRoleDO creatOrUpdate(UserRefRoleDO userRefRoleDO) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param userRefRoleDO 实例对象
     * @return 实例对象
     */
    public UserRefRoleDO updateUserRefRoleDO(UserRefRoleDO userRefRoleDO) {
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
}
