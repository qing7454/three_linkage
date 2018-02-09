package com.qing.area.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.qing.area.model.Area;
 
/**
 * 描述：省市区地域模块dao接口，提供数据库操作方法
 *
 * @author fan.yang
 * @version 1.0 2018-02-10
 */
@Mapper
public interface AreaMapper  {
 
    /**
     * 根据pid查找省市区地域列表方法
     * @param parentCode
     * @return List<ChinaArea>: 实体对象的list
     */
    public List<Area>  selectByParentCode(Integer parentCode);
    
    /**
     * 根据pid查找省市区地域列表方法
     * @param pid
     * @return List<ChinaArea>: 实体对象的list
     */
    @Select("select * from area where parent_code=#{pid}")
    public List<Area>  selectByPid(@Param("pid") Integer pid);
}