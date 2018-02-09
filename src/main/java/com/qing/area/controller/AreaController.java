package com.qing.area.controller;
import java.util.List;
 
import javax.annotation.Resource;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qing.area.model.Area;
import com.qing.area.service.AreaService;
 
/**
 * 描述：省市区地域模块controller类，负责页面分发与跳转
 * 
 * @author fan.xiu
 * @version 1.0 2018-02-10
 */
  
@Controller
@RequestMapping("area")
public class AreaController{
    @Resource
    private AreaService areaService;
      
     
    /**
     * 
     * @param pid String：父级区域的id
     * @return List<ChinaArea>根据pid查询出来的结果，最终以json格式相应客户端
     */
    @RequestMapping("/loadAreasByParentCode")
    public @ResponseBody List<Area> loadAreasByParentCode(Integer parentCode){
        if(parentCode==null){
            parentCode = 0;
        }
        return areaService.loadAreasByParentCode(parentCode);
    }   
}