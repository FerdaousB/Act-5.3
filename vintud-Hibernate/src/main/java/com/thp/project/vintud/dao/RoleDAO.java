package com.thp.project.vintud.dao;

import java.util.List;

import com.thp.project.vintud.entity.Role;

public interface RoleDAO {
	
	public List<Role> getAllRole();
	public void createRole(Role role);
	public void UpdateRole(Role role);
	public boolean DeleteRole(Role role);

}
