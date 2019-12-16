package com.haocheng.study.springboot.mybatisplus.part1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.haocheng.study.springboot.mybatisplus.part1.entity.Chengji;
import com.haocheng.study.springboot.mybatisplus.part1.mapper.ChengjiMapper;
import com.haocheng.study.springboot.mybatisplus.part1.service.ChengjiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haocheng
 * @since 2019-12-15
 */
@Service
public class ChengjiServiceImpl extends ServiceImpl<ChengjiMapper, Chengji> implements ChengjiService {

    @Resource
    private ChengjiMapper chengjiMapper;

    @Override
    public Chengji getByName(String name) {
        QueryWrapper<Chengji> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(Chengji::getName, name);
        return chengjiMapper.selectOne(wrapper);
    }

//    public Page<Chengji> get4Page(){
//        Page<Chengji> page = new Page<>();
//        QueryWrapper<Chengji> queryWrapper = new QueryWrapper<>();
//        return chengjiMapper.selectPage(page, queryWrapper);
//    }
}
