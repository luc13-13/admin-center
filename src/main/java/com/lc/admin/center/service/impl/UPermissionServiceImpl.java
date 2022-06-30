package com.lc.admin.center.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.admin.center.model.UPermissionDO;
import com.lc.admin.center.mapper.UPermissionDao;
import com.lc.admin.center.service.UPermissionService;
import com.lc.admin.center.web.request.PageRequest;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 操作权限表(UPermission)表服务接口
 * @author lucheng
 * @date 2022-04-28 23:09:34
 */
@Service
public class UPermissionServiceImpl extends ServiceImpl<UPermissionDao,UPermissionDO> implements UPermissionService {
    
    @Autowired
    private UPermissionDao uPermissionDao;
    

    /**
     * 查询多条数据
     *
     * @param pageRequest 查询条件
     * @return 对象列表
     */
    public List<UPermissionDO> getUPermissionDOListPage(PageRequest pageRequest){
        return null;
    }

    /**
     * 新增数据
     *
     * @param uPermissionDO 实例对象
     * @return 实例对象
     */
    public UPermissionDO creatOrUpdate(UPermissionDO uPermissionDO) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param uPermissionDO 实例对象
     * @return 实例对象
     */
    public UPermissionDO updateUPermissionDO(UPermissionDO uPermissionDO) {
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
    public Set<String> getUserPermissions(String loginName) {
        List<UPermissionDO> doList =  uPermissionDao.selectList(
                new QueryWrapper<UPermissionDO>().like("login_name",loginName));
        Set<String> permissions = doList.stream().map(e -> String.valueOf(e.getId())).collect(Collectors.toSet());
        return permissions;
    }
}
