package cn.smbms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.entity.Role;
import cn.smbms.entity.User;

public interface RoleMapper {
	public List<Role> getRoleAndUser();
	//添加角色
	public Integer addUser(Role role);
	//修改角色
	public Integer updateRole(@Param("id")Integer id,@Param("roleName")String roleName);
	//根据角色名称模糊查询
	public List<Role> getRoleName(@Param("roleName")String roleName);
	//if+set实现根据角色id修改角色信息
	public Integer getRoleId(Role role);
	//if+trim实现根据角色名称模糊查询角色列表的操作
	public List<Role> getSelectName(Role role);
}
