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


import com.dao.DiscusschangjianwentiDao;
import com.entity.DiscusschangjianwentiEntity;
import com.service.DiscusschangjianwentiService;
import com.entity.vo.DiscusschangjianwentiVO;
import com.entity.view.DiscusschangjianwentiView;

@Service("discusschangjianwentiService")
public class DiscusschangjianwentiServiceImpl extends ServiceImpl<DiscusschangjianwentiDao, DiscusschangjianwentiEntity> implements DiscusschangjianwentiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschangjianwentiEntity> page = this.selectPage(
                new Query<DiscusschangjianwentiEntity>(params).getPage(),
                new EntityWrapper<DiscusschangjianwentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschangjianwentiEntity> wrapper) {
		  Page<DiscusschangjianwentiView> page =new Query<DiscusschangjianwentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschangjianwentiVO> selectListVO(Wrapper<DiscusschangjianwentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschangjianwentiVO selectVO(Wrapper<DiscusschangjianwentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschangjianwentiView> selectListView(Wrapper<DiscusschangjianwentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschangjianwentiView selectView(Wrapper<DiscusschangjianwentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
