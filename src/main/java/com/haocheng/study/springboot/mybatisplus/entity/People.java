package com.haocheng.study.springboot.mybatisplus.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author haocheng
 * @since 2019-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String position;

    private LocalDate employdate;

    private String salay;

    private String awards;

    private String dept;


}
