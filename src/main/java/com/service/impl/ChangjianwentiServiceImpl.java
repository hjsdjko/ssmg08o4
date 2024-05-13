package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangjianwentiDao;
import com.entity.ChangjianwentiEntity;
import com.service.ChangjianwentiService;
import com.entity.vo.ChangjianwentiVO;
import com.entity.view.ChangjianwentiView;

@Service("changjianwentiService")
public class ChangjianwentiServiceImpl extends ServiceImpl<ChangjianwentiDao, ChangjianwentiEntity> implements ChangjianwentiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangjianwentiEntity> page = this.selectPage(
                new Query<ChangjianwentiEntity>(params).getPage(),
                new EntityWrapper<ChangjianwentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangjianwentiEntity> wrapper) {
		  Page<ChangjianwentiView> page =new Query<ChangjianwentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangjianwentiVO> selectListVO(Wrapper<ChangjianwentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangjianwentiVO selectVO(Wrapper<ChangjianwentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangjianwentiView> selectListView(Wrapper<ChangjianwentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangjianwentiView selectView(Wrapper<ChangjianwentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
