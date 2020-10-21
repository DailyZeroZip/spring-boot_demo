package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Sysmenu;
import com.example.demo.mapper.SysmenuMapper;
import com.example.demo.service.SysMenuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("SysMenuService")
@AllArgsConstructor
public class SysMenuServiceImpl extends ServiceImpl<SysmenuMapper, Sysmenu> implements SysMenuService {
    private SysmenuMapper sysmenuMapper;

    @Override
    public List<Sysmenu> list() {
        return sysmenuMapper.list();
    }
}
