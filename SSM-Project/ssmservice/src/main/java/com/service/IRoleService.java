package com.service;

import com.domain.Permission;
import com.domain.Role;

import java.util.List;


public interface IRoleService {

    List<Role> findAll() throws Exception;

    public void save(Role role);

    Role findById(String roleId);

    List<Permission> findOtherPermissions(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);
}
