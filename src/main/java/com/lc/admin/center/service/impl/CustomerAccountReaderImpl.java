package com.lc.admin.center.service.impl;

import com.lc.admin.center.bo.CustomerAccountBO;
import com.lc.admin.center.dto.CustomerAccountDTO;
import com.lc.admin.center.model.CustomerAccountDO;
import com.lc.admin.center.convertor.CustomerAccountConvertor;
import com.lc.admin.center.mapper.CustomerAccountDOMapper;
import com.lc.admin.center.service.CustomerAccountReader;

import org.springframework.stereotype.Service;

import enums.ArgsExceptionEnum;
import excp.ArgumentException;
import java.util.List;
import java.util.Map;

/**
 * 顾客账号信息表(CustomerAccount)表数据库访问层
 *
 * @author lucheng
 * @since 2021-12-11 17:49:46
 */
@Service
public class CustomerAccountReaderImpl implements CustomerAccountReader {
    
    private CustomerAccountDOMapper customerAccountDOMapper;
    private CustomerAccountConvertor customerAccountConvertor;
    
    public CustomerAccountReaderImpl(
        CustomerAccountDOMapper customerAccountDOMapper,
        CustomerAccountConvertor customerAccountConvertor) {
        this.customerAccountDOMapper = customerAccountDOMapper;
        this.customerAccountConvertor = customerAccountConvertor;
    }
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public CustomerAccountBO queryByPrimaryKey(Long id) {
        if(id == null) {
            throw new ArgumentException(ArgsExceptionEnum.NOT_NULL.getMessage());
        }
        CustomerAccountDO customerAccountDO = customerAccountDOMapper.selectByPrimaryKey(id);
                return this.customerAccountConvertor.convertDO2BO(customerAccountDO);
    }
	
    /**
     * 分页查询
     *
     * @param rowStart 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    public List<CustomerAccountBO> queryByPageRequest(int rowStart, int limit) {
        return null;
    }
    
    /**
     * 查询满足请求的数据量
     * @return 数据总数
     */
    public int countByRequest(CustomerAccountDTO queryDTO) {
        if(queryDTO == null) {
            return 0;
        }
        CustomerAccountDO queryDO = customerAccountConvertor.convertDTO2DO(queryDTO);
        return customerAccountDOMapper.countBySelectedDO(queryDO);
    }
        
    /**
     * 通过DTO筛选条件查询
     *
     * @param queryDTO 实例对象
     * @return 对象列表
     */
    public List<CustomerAccountBO> queryByDTO(CustomerAccountDTO queryDTO){
        CustomerAccountDO queryDO = customerAccountConvertor.convertDTO2DO(queryDTO);
        List<CustomerAccountDO> doList = customerAccountDOMapper.selectBySelectedDO(queryDO);
        return customerAccountConvertor.convertDO2BOList(doList);
    }

}

