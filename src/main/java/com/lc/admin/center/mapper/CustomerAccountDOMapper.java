package com.lc.admin.center.mapper;

import com.lc.admin.center.model.CustomerAccountDO;
import com.lc.admin.center.bo.CustomerAccountBO;
import com.lc.admin.center.dto.CustomerAccountDTO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerAccountDOMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerAccountDO selectByPrimaryKey(Long id);
	
    /**
     * 分页查询
     * @return 对象列表
     */
    List<CustomerAccountDO> selectByPageRequest(@Param("rowStart") int rowStart, @Param("limit") int limit);
    
    /**
     * 查询满足请求的数据量
     * @return 数据总数
     */
    int countBySelectedDO(CustomerAccountDO queryDO);
        
    /**
     * 通过DTO筛选条件查询
     *
     * @param queryDO 实例对象
     * @return 对象列表
     */
    List<CustomerAccountDO> selectBySelectedDO(CustomerAccountDO queryDO);

    /**
     * 新增数据
     *
     * @param record 实例对象
     * @return 影响行数
     */
    int insert(CustomerAccountDO record);
	
	/**
     * 批量新增
     *
     * @param doList 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(@Param("list") List<CustomerAccountDO> doList);
	
    /**
     * 修改数据
     *
     * @param record 实例对象
     * @return 影响行数
     */
    int updateBySelectedDO(CustomerAccountDO record);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long id);
}

