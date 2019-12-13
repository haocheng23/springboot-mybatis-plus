package com.haocheng.study.springboot.mybatisplus.service.impl;

import com.haocheng.study.springboot.mybatisplus.entity.Log;
import com.haocheng.study.springboot.mybatisplus.mapper.LogMapper;
import com.haocheng.study.springboot.mybatisplus.service.LogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
