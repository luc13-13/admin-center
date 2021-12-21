package com.lc.admin.center.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import com.luc.framework.core.util.PaginationParams;

@Data
@Builder
public class CustomerAccountDTO implements PaginationParams {

    private Integer pageIndex;
    private Integer pageSize;
    private Integer rowStart;
}
