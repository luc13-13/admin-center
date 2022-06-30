package com.lc.admin.center.dto;

import com.luc.framework.core.util.PaginationParams;
import lombok.Data;

/**
 * @author: lucheng
 * @data: 2021/12/11 16:17
 * @version: 1.0
 */
@Data
public class DemoDTO implements PaginationParams {
    private Integer pageSize;
    private Integer rowStart;
    private Integer pageIndex;
}
