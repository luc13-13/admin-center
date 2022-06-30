package com.lc.admin.center.bo;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 角色权限关系表(RoleRefPermission)业务对象
 *
 * @author lucheng
 * @since 2022-04-28 23:14:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleRefPermissionBO implements Serializable {

    private static final long serialVersionUID = 837150895440766936L;

    /*** 主键id */    
    private Long id;

    /*** 角色id */    
    private Long roleId;

    /*** 权限id */    
    private Long permissionId;

    /*** 角色权限是否失效,0 已失效, 1 未失效 */    
    private Integer invalid;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

}
