package com.qing.area.model;

import com.qing.common.bean.Model;

/**
 * 描述：省市区地域模块实体类，负责页面与后台数据传输功能
 *
 * @author fan.xiu
 * @version 1.0 2018-02-10
 */
public class Area extends Model{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer code;
    private String areaName;
    private Integer parentCode;
    private String abbreviation;
    private Integer areaTelephone;
    private Integer zipCode;
    private String pinyin;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    public Integer getParentCode() {
        return parentCode;
    }
    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public Integer getAreaTelephone() {
        return areaTelephone;
    }
    public void setAreaTelephone(Integer areaTelephone) {
        this.areaTelephone = areaTelephone;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public String getPinyin() {
        return pinyin;
    }
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
     
}