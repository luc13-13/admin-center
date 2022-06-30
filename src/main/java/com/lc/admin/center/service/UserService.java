package com.lc.admin.center.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.admin.center.bo.UserBO;
import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.web.request.PageRequest;
import java.util.List;

/**
 * 顾客账号信息表(User)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
public interface UserService extends IService<UserDO> {

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    List<UserDO> getUserDOListPage(PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param userDO 实例对象
     * @return 实例对象
     */
    UserDO creatOrUpdate(UserDO userDO);

    /**
     * 修改数据
     *
     * @param userDO 实例对象
     * @return 实例对象
     */
    UserDO updateUserDO(UserDO userDO);

    /**
     * 物理删除
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     *
     * @param username 用户登陆账号
     * @return 返回用户信息
     */
    UserBO findByLoginName(String username);

    void doGetUserAuthorizationInfo(UserBO userBO);
}
