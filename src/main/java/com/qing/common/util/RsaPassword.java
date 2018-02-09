package com.qing.common.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：数据库连接，密码解密
 * @author fan.xiu
 * @version 1.0 2018-02-08
 */
@Configuration
public class RsaPassword extends DruidDataSource{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6157734889361409772L;

	//重新设置连接密码
//	@Override
//	public void setPassword(String password) {
//		String newPass = null;
//		DESCipher des;
//		try {
//			des = new DESCipher("CHINASOFT");
//			newPass = des.decrypt(password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		super.setPassword(newPass);
//	}
}
