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


import com.dao.DiscussyanyuanjianjieDao;
import com.entity.DiscussyanyuanjianjieEntity;
import com.service.DiscussyanyuanjianjieService;
import com.entity.vo.DiscussyanyuanjianjieVO;
import com.entity.view.DiscussyanyuanjianjieView;

@Service("discussyanyuanjianjieService")
public class DiscussyanyuanjianjieServiceImpl extends ServiceImpl<DiscussyanyuanjianjieDao, DiscussyanyuanjianjieEntity> implements DiscussyanyuanjianjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyanyuanjianjieEntity> page = this.selectPage(
                new Query<DiscussyanyuanjianjieEntity>(params).getPage(),
                new EntityWrapper<DiscussyanyuanjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyanyuanjianjieEntity> wrapper) {
		  Page<DiscussyanyuanjianjieView> page =new Query<DiscussyanyuanjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyanyuanjianjieVO> selectListVO(Wrapper<DiscussyanyuanjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyanyuanjianjieVO selectVO(Wrapper<DiscussyanyuanjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyanyuanjianjieView> selectListView(Wrapper<DiscussyanyuanjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyanyuanjianjieView selectView(Wrapper<DiscussyanyuanjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
