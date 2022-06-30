package com.lc.admin.center.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.admin.center.bo.UserBO;
import com.lc.admin.center.convertor.UserConvertor;
import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.mapper.UserDao;
import com.lc.admin.center.service.RoleService;
import com.lc.admin.center.service.UPermissionService;
import com.lc.admin.center.service.UserService;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.lc.admin.center.web.request.PageRequest;
import java.util.List;
import java.util.Set;

/**
 * 顾客账号信息表(User)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao,UserDO> implements UserService {
    
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UPermissionService uPermissionService;
    @Autowired
    private UserConvertor userConvertor;
    

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    public List<UserDO> getUserDOListPage(PageRequest pageRequest){
        return null;
    }

    /**
     * 新增数据
     *
     * @param userDO 实例对象
     * @return 实例对象
     */
    public UserDO creatOrUpdate(UserDO userDO) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param userDO 实例对象
     * @return 实例对象
     */
    public UserDO updateUserDO(UserDO userDO) {
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
    public void doGetUserAuthorizationInfo(UserBO userBO) {
        Set<String> roles = roleService.getUserRoles(userBO.getLoginName());
        userBO.setRoles(roles);

        Set<String> permissions = uPermissionService.getUserPermissions(userBO.getLoginName());
        userBO.setPermissions(permissions);
    }

    /**
     *
     * @param username 用户登陆账号
     * @return 返回用户信息
     */
    @Override
    public UserBO findByLoginName(String username) {
        UserDO userDO = userDao.selectOne(
                new QueryWrapper<UserDO>().like("login_name",username)
        );
        return userConvertor.convertDO2BO(userDO);
    }
}
