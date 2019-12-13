package com.haocheng.study.springboot.mybatisplus.service.impl;

import com.haocheng.study.springboot.mybatisplus.entity.People;
import com.haocheng.study.springboot.mybatisplus.mapper.PeopleMapper;
import com.haocheng.study.springboot.mybatisplus.service.PeopleService;
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
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {

}
