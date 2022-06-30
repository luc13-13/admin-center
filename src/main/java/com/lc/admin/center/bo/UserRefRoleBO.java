package com.lc.admin.center.bo;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 用户权限关系表(UserRefRole)业务对象
 *
 * @author lucheng
 * @since 2022-04-28 23:14:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRefRoleBO implements Serializable {

    private static final long serialVersionUID = -90614771802260072L;

    /*** 主键id */    
    private Long id;

    /*** 用户id */    
    private Long userId;

    /*** 权限id */    
    private Long roleId;

    /*** 权限是否失效, 0 已失效, 1 未失效 */    
    private Integer invalid;

    /*** 权限到期日期 */    
    private Date expiredData;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 修改时间 */    
    private Date dtModified;

}
