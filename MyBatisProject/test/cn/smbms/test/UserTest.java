package cn.smbms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.smbms.dao.RoleMapper;
import cn.smbms.dao.UserMapper;
import cn.smbms.entity.Role;
import cn.smbms.entity.User;
import cn.smbms.util.MyBatisUtil;

public class UserTest {
	@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserList2(2,10);
		for(User user:roleList) {
			System.out.println(user.getUserCode()+"\t"+user.getUserName()+"\t"+user.getUserPassword());
		}
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		User user=new User();
		user.setUserCode("admin");
		user.setUserName("添加");
		user.setUserRole(3);
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByConditions6(user);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		List<Integer> ids=new ArrayList<>();
		ids.add(1);
		ids.add(2);
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("ids",ids);
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByEach3(map);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		List<Integer> ids=new ArrayList<>();
		ids.add(1);
		ids.add(2);
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByEach2(ids);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		Integer[] ids= {1,2};
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByEach1(ids);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		User user=new User();
		user.setId(50);
		user.setUserName("添加16");
		user.setUserPassword("123456");
		//user.setUserRole(3);
		int roleList=sqlSession.getMapper(UserMapper.class).updateUser3(user);
		System.out.println(roleList);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
/*	@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		User user=new User();
		user.setUserName("添加");
		//user.setUserRole(3);
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByConditions5(user);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		User user=new User();
		//user.setUserName("添加");
		user.setUserRole(3);
		List<User> roleList=sqlSession.getMapper(UserMapper.class).getUserByConditions4(user);
		System.out.println(roleList.size());
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testRoleList() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<Role> roleList=sqlSession.getMapper(RoleMapper.class).getRoleAndUser();
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		for(Role role:roleList) {
			for(User user:role.getUserList()) {
				System.out.println(role.getRoleName()+"\t"+user.getUserName());
			}
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testUpdateUserList2() {
		SqlSession sqlSession=null;
		List<User> list=new ArrayList<User>();
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		list=sqlSession.getMapper(UserMapper.class).getUserAndRole();
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		for(User user:list) {
			System.out.println(user.getUserCode()+"\t"+user.getUserName()+"\t"+user.getRole().getRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testUpdateUserList2() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		int num=sqlSession.getMapper(UserMapper.class).deleteUser(52);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(num);
		for(User user1:list) {
			System.out.println(user1.getUserName()+"\t"+user1.getUserRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	/*@Test
	public void testUpdateUserList2() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		int num=sqlSession.getMapper(UserMapper.class).updateUser2(52,"修改添加");
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(num);
		for(User user1:list) {
			System.out.println(user1.getUserName()+"\t"+user1.getUserRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	//@Test
	/*public void testUpdateUserList1() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		User user=new User();
		user.setId(52);
		user.setUserName("添加测试17");
		int num=sqlSession.getMapper(UserMapper.class).updateUser1(user);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(num);
		for(User user1:list) {
			System.out.println(user1.getUserName()+"\t"+user1.getUserRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
	//@Test
	/*public void testGetUserList() {
		//List<Provider> list=new ArrayList<Provider>();
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setUserName("添加");
		user.setUserRole(3);
		Map map=new HashMap();
		map.put("userName","添加");
		map.put("userRole","3");
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		User user=new User();
		user.setUserCode("admin17");
		user.setUserName("添加17");
		user.setUserPassword("100000");
		int num=sqlSession.getMapper(UserMapper.class).addUser(user);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(num);
		for(User user1:list) {
			System.out.println(user1.getUserName()+"\t"+user1.getUserRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}*/
		
		/*for(Provider pro:list) {
			System.out.println(pro.getId()+pro.getProCode()+pro.getProName()+pro.getProDesc()+pro.getProContact()+pro.getProPhone());
		}*/
	}
}
