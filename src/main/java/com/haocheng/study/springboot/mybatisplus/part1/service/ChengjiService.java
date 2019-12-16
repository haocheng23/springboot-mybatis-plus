package com.haocheng.study.springboot.mybatisplus.part1.service;

import com.haocheng.study.springboot.mybatisplus.part1.entity.Chengji;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haocheng
 * @since 2019-12-15
 */
public interface ChengjiService extends IService<Chengji> {

    Chengji getByName(String name);
}
