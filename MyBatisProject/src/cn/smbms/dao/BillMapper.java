package cn.smbms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.smbms.entity.Bill;
import cn.smbms.entity.Provider;

public interface BillMapper {
	//查询信息
	public List<Bill> getBillList(Bill bill); 
	//上机1.3
	public List<Bill> getShangji1(@Param("productName")String pn,@Param("providerId")Integer pid,@Param("isPayment")Integer ipt);
	//上机2.3
	public List<Provider> getShangji2(@Param("proCode")String pc,@Param("proName")String pn);
	//上机3.3
	public int modify(Provider provider);
	//上机5.3
	public List<Provider> getShangji5(Integer[] ids);
	//上机6.3
	public List<Bill> getShangji6(Map<String,Object> conditionMap);
	//上机7.3
	public List<Provider> getShangji7(Provider provider);
	//上机8.3
	
}
