package com.haocheng.study.springboot.mybatisplus.service.impl;

import com.haocheng.study.springboot.mybatisplus.entity.Dept;
import com.haocheng.study.springboot.mybatisplus.mapper.DeptMapper;
import com.haocheng.study.springboot.mybatisplus.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haocheng
 * @since 2019-12-13
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
