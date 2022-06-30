package com.lc.admin.center.model;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 顾客账号信息表(User)实体类
 *
 * @author lucheng
 * @since 2022-04-28 23:09:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("")
public class UserDO implements Serializable {

    private static final long serialVersionUID = 991289899828216515L;

    /*** 主键id */    
    private Long id;

    /*** 用户名，用于登录和显示 */    
    private String loginName;

    /*** 用户邮箱 */    
    private String email;

    /*** 手机号 */    
    private Long phone;

    /*** 身份证号 */    
    private String idCard;

    /*** 经后端加密后的密码 */    
    private String pwd;

    /*** 顾客是否注销,0 已注销, 1 未注销 */    
    private Integer invalid;

    /*** 登陆来源 */    
    private String loginSource;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

}
