package com.lc.admin.center.web.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author: lucheng
 * @data: 2021/12/12 15:58
 * @version: 1.0
 */
@Data
@Builder
public class LoginRequest {
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String pwd;
    @ApiModelProperty(value = "验证码")
    private String verifyCode;
    @ApiModelProperty(value = "记住我")
    private Integer remember;
}
