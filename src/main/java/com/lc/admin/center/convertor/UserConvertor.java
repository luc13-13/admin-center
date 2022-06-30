package com.lc.admin.center.convertor;

import com.lc.admin.center.bo.UserBO;
import com.lc.admin.center.model.UserDO;

import java.util.List;

/**
 * 顾客账号信息表(User)表数据库访问层
 *
 * @author lucheng
 * @since 2022-02-22 13:09:52
 */
public interface UserConvertor {

    /**
     * 将DO转为BO
     * @param record 数据实体对象
     * @return BO
     */
    UserBO convertDO2BO(UserDO record);
	
    /**
     * 将DOList转为BOList
     * @param recordList 数据列表
     * @return 对象列表
     */
    List<UserBO> convertDO2BOList(List<UserDO> recordList);
    
    /**
     * 将BO转为DO进行数据访问
     * @param bo 业务对象
     * @return 数据总数
     */
    UserDO convertBO2DO(UserBO bo);
        
    /**
     * 通过DTO筛选条件查询
     *
     * @param doList 实例对象
     * @return 对象列表
     */
    List<UserDO> convertBO2DOList(List<UserDO> doList);
    
//    UserDO convertDTO2DO(UserDTO dto);
    
//    List<UserDO> convertDTOs2DOS(List<UserDTO> dtos);

}

