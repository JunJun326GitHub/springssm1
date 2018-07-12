package com.ssm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //自动生成get.set.tostring方法的注解
@NoArgsConstructor//生成无参构造器注解
@AllArgsConstructor//生成有参构造器的注解
public class TbScore {
    private Integer bh;

    private Integer score;
    // TODO 吃出
    private String sname;

    private String subject;


}