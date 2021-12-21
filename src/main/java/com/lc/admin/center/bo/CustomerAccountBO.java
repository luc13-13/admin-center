package com.lc.admin.center.bo;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAccountBO {

    
    private Long id;
    
    private String loginName;
    
    private String email;
    
    private Long phone;
    
    private String idCard;
    
    private String pwd;
    
    private Integer invalid;
    
    private Date dtCreated;
    
    private Date dtModified;
    
    private Date dtCreate;

}
