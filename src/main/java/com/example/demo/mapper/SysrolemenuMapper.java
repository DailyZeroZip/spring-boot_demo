package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.Sysrolemenu;
import com.example.demo.domain.SysrolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysrolemenuMapper extends BaseMapper<Sysrolemenu> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    long countByExample(SysrolemenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int deleteByExample(SysrolemenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int insert(Sysrolemenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int insertSelective(Sysrolemenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    List<Sysrolemenu> selectByExample(SysrolemenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    Sysrolemenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Sysrolemenu record, @Param("example") SysrolemenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Sysrolemenu record, @Param("example") SysrolemenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sysrolemenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sysrolemenu record);
}