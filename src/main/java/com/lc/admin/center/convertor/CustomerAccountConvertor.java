package com.lc.admin.center.convertor;

import com.lc.admin.center.bo.CustomerAccountBO;
import com.lc.admin.center.dto.CustomerAccountDTO;
import com.lc.admin.center.model.CustomerAccountDO;
import java.util.List;
import java.util.Map;

/**
 * 顾客账号信息表(CustomerAccount)表数据库访问层
 *
 * @author lucheng
 * @since 2021-12-11 17:40:42
 */
public interface CustomerAccountConvertor {

    /**
     * 将DO转为BO
     * @param record 数据实体对象
     * @return BO
     */
    CustomerAccountBO convertDO2BO(CustomerAccountDO record);
	
    /**
     * 将DOList转为BOList
     * @param recordList 数据列表
     * @return 对象列表
     */
    List<CustomerAccountBO> convertDO2BOList(List<CustomerAccountDO> recordList);
    
    /**
     * 将BO转为DO进行数据访问
     * @param bo 业务对象
     * @return 数据总数
     */
    CustomerAccountDO convertBO2DO(CustomerAccountBO bo);
        
    /**
     * 通过DTO筛选条件查询
     *
     * @param doList 实例对象
     * @return 对象列表
     */
    List<CustomerAccountDO> convertBO2DOList(List<CustomerAccountDO> doList);
    
    CustomerAccountDO convertDTO2DO(CustomerAccountDTO dto);
    
    List<CustomerAccountDO> convertDTOs2DOS(List<CustomerAccountDTO> dtos);

}

