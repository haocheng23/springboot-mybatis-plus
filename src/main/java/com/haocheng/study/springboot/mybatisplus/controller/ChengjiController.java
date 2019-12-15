package com.haocheng.study.springboot.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haocheng.study.springboot.mybatisplus.entity.Chengji;
import com.haocheng.study.springboot.mybatisplus.service.ChengjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
    public IPage<Chengji> get4Page(){
        Page<Chengji> page = new Page<>(1,3);
        return chengjiService.page(page);

    }
}
