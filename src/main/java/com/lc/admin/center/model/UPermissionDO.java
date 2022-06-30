package com.lc.admin.center.model;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 操作权限表(UPermission)实体类
 *
 * @author lucheng
 * @since 2022-04-28 23:09:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("")
public class UPermissionDO implements Serializable {

    private static final long serialVersionUID = -66354785501677776L;

    /*** 主键id */    
    private Long id;

    /*** 权限描述 */    
    private String desc;

    /*** 权限是否失效,0 已失效, 1 未失效 */    
    private Integer invalid;

    /*** 创建时间 */    
    private Date dtCreated;

    /*** 创建时间 */    
    private Date dtModified;

}
