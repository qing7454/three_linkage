package com.qing.common.enums;

/**
 * @ClassName: OrgType
 * @Description: 机构类型枚举
 * @author fan.xiu
 * @date 2018年02月09日 下午14:17:56
 * 
 */

public enum OrgType{
    
    /**
     * 
     */
    UNIT("1","单位","单位"),
    /**
     *  
     */
    DEPT("2","部门","部门");
 
    private String value;
	
    private String name;
    
    private String descript;
    
    private int sort;
    
    private OrgType(String _value,String _name,String _desc){
    	value = _value;
        name = _name;
        descript = _desc;
        sort = this.ordinal();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
    
}
