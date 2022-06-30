package com.lc.admin.center.model;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 权限表(Role)实体类
 *
 * @author lucheng
 * @since 2022-04-28 23:09:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("")
public class RoleDO implements Serializable {

    private static final long serialVersionUID = -73064625475887517L;

    /*** 主键id */    
    private Long id;

    /*** 权限描述 */    
    private String roleDesc;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

}
