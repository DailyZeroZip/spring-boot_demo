package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.*;
import com.example.demo.mapper.SysmenuMapper;
import com.example.demo.mapper.SysroleMapper;
import com.example.demo.mapper.SysuserMapper;
import com.example.demo.mapper.SysuserroleMapper;
import com.example.demo.service.SysUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("sysUserService")
@AllArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysuserMapper, Sysuser> implements SysUserService {

    private SysuserMapper sysuserMapper;
    private SysroleMapper sysroleMapper;
    private SysuserroleMapper sysuserroleMapper;
    @Override
    public Sysuser selectUserByName(String username) {
        Sysuser user = sysuserMapper.selectByName(username);
        return user;
    }

    /**
     * 通过用户ID查询角色集合
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<Sysrole> selectSysRoleByUserId(Long userId) {
        return sysroleMapper.selectSysRoleByUserId(userId);
    }

    @Override
    public List<Sysmenu> selectSysMenuByUserId(Long userId) {
        return sysuserroleMapper.selectSysMenuByUserId(userId);
    }
}
