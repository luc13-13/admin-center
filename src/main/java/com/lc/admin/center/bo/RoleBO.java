package com.lc.admin.center.bo;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 权限表(Role)业务对象
 *
 * @author lucheng
 * @since 2022-04-28 23:14:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleBO implements Serializable {

    private static final long serialVersionUID = 164048259111451943L;

    /*** 主键id */    
    private Long id;

    /*** 权限描述 */    
    private String roleDesc;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

}
