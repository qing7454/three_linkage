package com.qing.area.service;

import java.util.List;

import com.qing.area.model.Area;


/**
 * 描述：省市区地域模块service接口，提供controller操作所需方法
 *
 * @author fan.xiu
 * @version 1.0 2018-02-10
 */
public interface AreaService  {

	/**
	 * 根据父区域返回下面的所有子区域集合对象
	 * @param parentCode String：父级区域的id
	 * @return List<Area>根据parentCode查询出来的结果，最终以json格式相应客户端
	 */	
	public List<Area> loadAreasByParentCode(Integer parentCode);
	
}