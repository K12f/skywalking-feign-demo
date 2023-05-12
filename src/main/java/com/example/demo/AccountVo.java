package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author murphy.z
 * po for test
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVo implements Serializable {
//    private Long id;

    private static final long serialVersionUID = -6510209177813402222L;

    private String username;

    private String createBy;

    private String createTime;

    private String createName;

    private String companyId;

    private String updateTime;

    private String updateBy;
}







