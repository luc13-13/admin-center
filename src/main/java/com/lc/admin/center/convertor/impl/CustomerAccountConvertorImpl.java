package com.lc.admin.center.convertor.impl;

import com.lc.admin.center.bo.CustomerAccountBO;
import com.lc.admin.center.convertor.CustomerAccountConvertor;
import com.lc.admin.center.dto.CustomerAccountDTO;
import com.lc.admin.center.model.CustomerAccountDO;

import org.springframework.stereotype.Component;

import java.util.List;

import excp.ArgumentException;

/**
 * @author: lucheng
 * @data: 2021/12/11 18:06
 * @version: 1.0
 */
@Component
public class CustomerAccountConvertorImpl implements CustomerAccountConvertor {
    @Override
    public CustomerAccountBO convertDO2BO(CustomerAccountDO record) {
        if(record == null) {
            throw new ArgumentException(500,"没有记录");
        }
        return CustomerAccountBO.builder()
                .id(record.getId())
                .email(record.getEmail())
                .idCard(record.getIdCard())
                .loginName(record.getLoginName())
                .pwd(record.getPwd())
                .phone(record.getPhone())
                .invalid(record.getInvalid()).build();
    }

    @Override
    public List<CustomerAccountBO> convertDO2BOList(List<CustomerAccountDO> recordList) {
        return null;
    }

    @Override
    public CustomerAccountDO convertBO2DO(CustomerAccountBO bo) {
        return null;
    }

    @Override
    public List<CustomerAccountDO> convertBO2DOList(List<CustomerAccountDO> doList) {
        return null;
    }

    @Override
    public CustomerAccountDO convertDTO2DO(CustomerAccountDTO dto) {
        return null;
    }

    @Override
    public List<CustomerAccountDO> convertDTOs2DOS(List<CustomerAccountDTO> dtos) {
        return null;
    }
}
