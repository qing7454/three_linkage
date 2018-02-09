package com.qing.area.service;
import java.util.List;

import javax.annotation.Resource;

import com.qing.datasource.DS;
import org.springframework.stereotype.Service;

import com.qing.area.mapper.AreaMapper;
import com.qing.area.model.Area;

/**
 * 描述：省市区地域模块service接口实现类，实现service接口方法
 *
 * @author fan.xiu
 * @version 1.0 2018-02-10
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService{
        @Resource
        private AreaMapper areaMapper;

		@Override
		@DS("r")
		public List<Area> loadAreasByParentCode(Integer parentCode) {
			return areaMapper.selectByParentCode(parentCode);
		}

}