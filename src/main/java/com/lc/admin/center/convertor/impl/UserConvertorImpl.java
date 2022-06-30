package com.lc.admin.center.convertor.impl;

import com.lc.admin.center.bo.UserBO;
import com.lc.admin.center.convertor.UserConvertor;
import com.lc.admin.center.model.UserDO;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: lucheng
 * @data: 2022/2/22 13:17
 * @version: 1.0
 */
@Component
public class UserConvertorImpl implements UserConvertor {
    @Override
    public UserBO convertDO2BO(UserDO record) {
        return null;
    }

    @Override
    public List<UserBO> convertDO2BOList(List<UserDO> recordList) {
        return null;
    }

    @Override
    public UserDO convertBO2DO(UserBO bo) {
        return null;
    }

    @Override
    public List<UserDO> convertBO2DOList(List<UserDO> doList) {
        return null;
    }
}
