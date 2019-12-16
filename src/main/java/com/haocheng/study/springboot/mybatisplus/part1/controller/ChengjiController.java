package com.haocheng.study.springboot.mybatisplus.part1.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haocheng.study.springboot.mybatisplus.part1.entity.Chengji;
import com.haocheng.study.springboot.mybatisplus.part1.service.ChengjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author haocheng
 * @since 2019-12-15
 */
@RestController
@RequestMapping("/chengji")
public class ChengjiController {

    @Autowired
    private ChengjiService chengjiService;

    @GetMapping("/getAll")
    public List<Chengji> getAll(){
        return chengjiService.list();
    }

    @GetMapping("/getByName")
    public Chengji getByName(String name){
        return chengjiService.getByName(name);
    }


    /**
     * 分页查询
     */
    @GetMapping("/get4Page")
    public IPage<Chengji> get4Page(String id){
        Page<Chengji> page = new Page<>(1,3);
        QueryWrapper<Chengji> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().gt(Chengji::getId, id);
        return chengjiService.page(page, queryWrapper);

    }
}
