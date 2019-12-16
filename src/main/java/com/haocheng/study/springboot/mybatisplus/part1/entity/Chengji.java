package com.haocheng.study.springboot.mybatisplus.part1.entity;

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
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Chengji implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String sub;

    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
