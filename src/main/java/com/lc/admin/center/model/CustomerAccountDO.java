package com.lc.admin.center.model;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javafx.scene.control.Pagination;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 顾客账号信息表(CustomerAccount)
 *
 * @author lucheng
 * @since 2021-12-10 16:28:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAccountDO implements Serializable {

    private static final long serialVersionUID = -13183728738763436L;

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

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

    /*** 创建时间 */    
    private Date dtCreate;

    private Pagination pagination;
}
