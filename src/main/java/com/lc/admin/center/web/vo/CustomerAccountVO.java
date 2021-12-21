package com.lc.admin.center.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author: lucheng
 * @data: 2021/12/11 17:58
 * @version: 1.0
 */
@Data
@Builder
public class CustomerAccountVO {
    @ApiModelProperty("登陆用户名")
    private String loginName;
}
