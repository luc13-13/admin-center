package com.lc.admin.center.model;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 角色权限关系表(RoleRefPermission)实体类
 *
 * @author lucheng
 * @since 2022-04-28 23:09:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("")
public class RoleRefPermissionDO implements Serializable {

    private static final long serialVersionUID = 693906864375925667L;

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
