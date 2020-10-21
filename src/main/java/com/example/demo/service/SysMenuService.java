package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.Sysmenu;

import java.util.List;

public interface SysMenuService extends IService<Sysmenu> {
    List<Sysmenu> list();
}
