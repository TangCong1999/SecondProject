package cn.smbms.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis工具类
 * @author 聪哥
 *
 */
public class MyBatisUtil {
	private static SqlSessionFactory factory=null;
	private static SqlSession sqlSession=null;
	static {
		try {
			String resource="mybatis-config.xml";
			InputStream is=Resources.getResourceAsStream(resource);
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//获取sqlSession
	public static SqlSession createSqlSession() {
		//开启事务控制，需要手动提交或毁回滚
		sqlSession=factory.openSession(false);
		return sqlSession;
	}
	//关闭sqlSession
	public static void closeSqlSession() {
		if (sqlSession!=null) {
			sqlSession.close();
		}
	}
}
