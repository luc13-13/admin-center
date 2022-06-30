package com.lc.admin.center.model;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 用户权限关系表(UserRefRole)实体类
 *
 * @author lucheng
 * @since 2022-04-28 23:09:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("")
public class UserRefRoleDO implements Serializable {

    private static final long serialVersionUID = -82174112696995719L;

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
