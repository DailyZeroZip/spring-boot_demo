package com.example.demo.domain;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   角色表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role
 */
public class Sysrole implements Serializable {
    /**
     * Database Column Remarks:
     *   角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     * Database Column Remarks:
     *   角色名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbg.generated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_id
     *
     * @return the value of sys_role.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_id
     *
     * @param roleId the value for sys_role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}