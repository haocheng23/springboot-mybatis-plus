package com.haocheng.study.springboot.mybatisplus.part2.service.impl;

import com.haocheng.study.springboot.mybatisplus.part2.entity.People;
import com.haocheng.study.springboot.mybatisplus.part2.mapper.PeopleMapper;
import com.haocheng.study.springboot.mybatisplus.part2.service.IPeopleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haocheng
 * @since 2019-12-16
 */
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements IPeopleService {

}
