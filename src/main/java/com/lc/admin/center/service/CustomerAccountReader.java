package com.lc.admin.center.service;

import com.lc.admin.center.bo.CustomerAccountBO;
import com.lc.admin.center.dto.CustomerAccountDTO;
import java.util.List;
import java.util.Map;

/**
 * 顾客账号信息表(CustomerAccount)表数据库访问层
 *
 * @author lucheng
 * @since 2021-12-11 17:40:42
 */
public interface CustomerAccountReader {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerAccountBO queryByPrimaryKey(Long id);
	
    /**
     * 分页查询
     *
     * @param rowStart 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CustomerAccountBO> queryByPageRequest(int rowStart, int limit);
    
    /**
     * 查询满足请求的数据量
     * @return 数据总数
     */
    int countByRequest(CustomerAccountDTO queryDTO);
        
    /**
     * 通过DTO筛选条件查询
     *
     * @param queryDTO 实例对象
     * @return 对象列表
     */
    List<CustomerAccountBO> queryByDTO(CustomerAccountDTO queryDTO);

}

