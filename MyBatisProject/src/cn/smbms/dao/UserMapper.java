package cn.smbms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.smbms.entity.Provider;
import cn.smbms.entity.User;

public interface UserMapper {
	public List<User> getUserList();
	public List<Provider> getProList();
	//根据姓名查询用户
	public List<User> getUserByUserName(String userName);
	//根据多条件查询用户
	public List<User> getUserByConditions1(User user);
	//根据多条件查询用户
	public List<User> getUserByConditions2(Map conditions);
	
	public List<User> getUserByConditions3(User user);
	//添加用户
	public Integer addUser(User user);
	//修改用户
	public Integer updateUser1(User user);
	public Integer updateUser2(@Param("id")Integer id,@Param("userName")String userName);
	//删除用户
	public Integer deleteUser(Integer id);
	//映射关系
	public List<User> getUserAndRole();
	//多条件查询，有选择性查询
	public List<User> getUserByConditions4(User user);
	public List<User> getUserByConditions5(User user);
	//修改用户
	public Integer updateUser3(User user);
	//根据用户角色查询
	public List<User> getUserByEach1(Integer[] ids);
	public List<User> getUserByEach2(List<Integer> ids);
	public List<User> getUserByEach3(Map<String,Object> idMap);
	//多条件查询，有选择性查询(choose)
	public List<User> getUserByConditions6(User user);
	//limit分页查询
	public List<User> getUserList2(@Param("from") Integer from,@Param("pageSize") Integer pageSize);
}
