package com.haocheng.study.springboot.mybatisplus.part2.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("POSITION")
    private String position;

    @TableField("EMPLOYDATE")
    private LocalDate employdate;

    @TableField("SALAY")
    private String salay;

    @TableField("AWARDS")
    private String awards;

    @TableField("DEPT")
    private String dept;


}
