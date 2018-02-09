package com.qing.common.excel;

import java.io.Serializable;


/**
 * 
 * @ClassName: ExpSeptPageBean
 * @Description: TODO(导出分页的BEAN)
 * @author fan.xiu
 * @date 2018-02-09
 * 
 */
public class ExpSeptPageBean implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 5571333092808590027L;
	/**
	 * 开始页
	 */
	private Integer startpage = Integer.valueOf(1);
	/**
	 * 结束页
	 */
	private Integer endpage = Integer.valueOf(1);

	/**
	 * 页大小
	 */
	private Integer pagesize = Integer.valueOf(20);
	private String order;
	/**
	 * 种类
	 */
	private String sort;

	public Integer getStartpage() {
		return startpage;
	}

	public void setStartpage(Integer startpage) {
		this.startpage = startpage;
	}

	public Integer getEndpage() {
		return endpage;
	}

	public void setEndpage(Integer endpage) {
		this.endpage = endpage;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
}
