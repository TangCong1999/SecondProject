package cn.smbms.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.smbms.dao.RoleMapper;
import cn.smbms.entity.Role;
import cn.smbms.entity.User;
import cn.smbms.util.MyBatisUtil;

public class RoleTest {
	//if+trim实现根据角色名称模糊查询角色列表的操作
	@Test
	public void testUpdate() {
		SqlSession sqlSession=null;
		Role role=new Role();
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		role.setRoleName("员");
		List<Role> roleList=sqlSession.getMapper(RoleMapper.class).getSelectName(role);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(roleList.size());
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	}
	//if+set实现根据角色id修改角色信息
	/*@Test
	public void testUpdate() {
		SqlSession sqlSession=null;
		Role role=new Role();
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		role.setRoleCode("SMBMS_BBB");
		role.setRoleName("小偷");
		role.setId(4);
		int roleList=sqlSession.getMapper(RoleMapper.class).getRoleId(role);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(roleList);
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	}*/
	//根据角色名称模糊查询角色用户列表
	/*@Test
	public void testUpdate() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		List<Role> roleList=sqlSession.getMapper(RoleMapper.class).getRoleName("管");
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		for(Role role:roleList) {
			System.out.println(role.getRoleCode()+role.getRoleName());
		}
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	}*/
	//根据角色id修改角色信息
	/*@Test
	public void testUpdate() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		int roleList=sqlSession.getMapper(RoleMapper.class).updateRole(4,"门警");
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(roleList);
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	}*/
	//添加信息
	/*@Test
	public void testRoleAdd() {
		SqlSession sqlSession=null;
		//1.读取全局配置文件
		try {
		sqlSession=MyBatisUtil.createSqlSession();
		Role role=new Role();
		role.setRoleCode("SMBMS_AAA");
		role.setRoleName("总裁");
		int roleList=sqlSession.getMapper(RoleMapper.class).addUser(role);
				//sqlSession.selectList("cn.smbms.dao.UserMapper.getUserList");
		System.out.println(roleList);
		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (sqlSession!=null) {
				sqlSession.rollback();
			}
		}finally {
			MyBatisUtil.closeSqlSession();
		}
	}*/
}
