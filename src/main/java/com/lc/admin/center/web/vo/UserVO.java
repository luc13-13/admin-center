package com.lc.admin.center.web.vo;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lucheng
 * @data: 2022/4/28 23:18
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

//    /*** 主键id */
//    private Long id;

    /*** 用户名，用于登录和显示 */
    private String loginName;

    /*** 用户邮箱 */
    private String email;

    /*** 手机号 */
    private Long phone;

    /*** 身份证号 */
    private String idCard;

//    /*** 经后端加密后的密码 */
//    private String pwd;

    /*** 顾客是否注销,0 已注销, 1 未注销 */
    private Integer invalid;

    /*** 登陆来源 */
    private String loginSource;

    /*** 创建时间 */
    private Date dtCreated;

    /*** 创建时间 */
    private Date dtModified;
}
