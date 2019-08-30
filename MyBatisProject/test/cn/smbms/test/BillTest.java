package cn.smbms.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.smbms.dao.BillMapper;
import cn.smbms.entity.Bill;
import cn.smbms.entity.Provider;
import cn.smbms.entity.User;
import cn.smbms.util.MyBatisUtil;

public class BillTest {
	@Test
	public void choosePro() {
		SqlSession sqlSession = null;
		List<Provider> proList = new ArrayList<Provider>();
		Provider provider=new Provider();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			provider.setProCode("BJ");
			provider.setProName("北京");
			provider.setProContact("张");
			proList = sqlSession.getMapper(BillMapper.class).getShangji7(provider);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSqlSession();
		}
		for (Provider pro : proList) {
			System.out.println(pro.getId()+"\t"+pro.getProCode()+"\t"+pro.getProName()+"\t"+pro.getProContact());
		}
	}
	//@Test
	public void foreachPro() {
		SqlSession sqlSession = null;
		List<Provider> proList = new ArrayList<Provider>();
		try {
			Integer[] ids= {2,4};
			sqlSession = MyBatisUtil.createSqlSession();
			proList = sqlSession.getMapper(BillMapper.class).getShangji5(ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSqlSession();
		}
		for (Provider pro : proList) {
			System.out.println(pro.getId()+"\t"+pro.getProCode()+"\t"+pro.getProName());
		}
	}
	//@Test
	public void modify() {
		SqlSession sqlSession=null;
		int count=0;
		try {
			sqlSession=MyBatisUtil.createSqlSession();
			Provider provider = new Provider();
			provider.setId(22);
			provider.setProCode("BJ_GYS000");
			provider.setProName("供应商测试");
			provider.setProContact("张四");
			provider.setProAddress("供应商测试地址");
			provider.setProPhone("13566664647");
			provider.setCreatedBy(3);
			provider.setCreationDate(new Date());
			provider.setProFax("010-588876565");
			provider.setProDesc("长期合作伙伴，主营产品：海绵床垫、坐垫、靠垫、海绵枕头、头枕等");
			count= sqlSession.getMapper(BillMapper.class).modify(provider);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession();
		}
		if (count==1) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}	
	}
	/*@Test
	public void testGetBillList() {
		SqlSession sqlSession = null;
		List<Provider> proList = new ArrayList<Provider>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			proList = sqlSession.getMapper(BillMapper.class).getShangji2("BJ","北京");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSqlSession();
		}
		for (Provider pro : proList) {
			System.out.println(pro.getId()+"\t"+pro.getProCode()+"\t"+pro.getProName());
		}

	}*/
	/*@Test
	public void testGetBillList() {
		SqlSession sqlSession = null;
		List<Bill> billList = new ArrayList<Bill>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			billList = sqlSession.getMapper(BillMapper.class).getShangji1("哈",2,2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSqlSession();
		}
		for (Bill bill : billList) {
			System.out.println("订单id：" + bill.getId() + " 订单编号: " + bill.getBillCode()
					+ " 商品名称：" + bill.getProductName()+" 供应商id： "+bill.getProviderId() 
					+ " 供应商名称："+bill.getProvider().getProName()+ " 订单金额： " + bill.getTotalPrice() 
					+ " 是否付款：" + bill.getIsPayment()+ "创建时间：" + new SimpleDateFormat("yyyy-MM-dd").format(bill.getCreationDate()));
		}

	}*/
	/*@Test
	public void testGetBillList() {
		SqlSession sqlSession = null;
		List<Bill> billList = new ArrayList<Bill>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Bill bill = new Bill();
			bill.setIsPayment(2);
			bill.setProductName("油");
			bill.setProviderId(7);
			billList = sqlSession.getMapper(BillMapper.class).getBillList(bill);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSqlSession();
		}

		for (Bill bill : billList) {
			System.out.println("testGetBillList id: " + bill.getId() + " and BillCode: " + bill.getBillCode()
					+ " and ProductName: " + bill.getProductName() + " and ProviderName: "
					+ " and TotalPrice: " + bill.getTotalPrice() + " and IsPayment: " + bill.getIsPayment()
					+ " and CreationDate:" + new SimpleDateFormat("yyyy-MM-dd").format(bill.getCreationDate()));
		}

	}*/

}
