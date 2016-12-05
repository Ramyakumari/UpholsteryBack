package com.niit.upholsteryback.service;




import java.util.List;

import com.niit.upholsteryback.model.Role;





public interface RoleDAO {
	
	 public List<Role> getAllRole();
	   public  Role getRole(String username);
	   public void insertRole(Role role);
	   public void updateRole(Role role);
	   public void deleteRole(int id);
	   public void deleteallRole(Role role);


}
