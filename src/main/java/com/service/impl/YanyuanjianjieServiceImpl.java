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


import com.dao.YanyuanjianjieDao;
import com.entity.YanyuanjianjieEntity;
import com.service.YanyuanjianjieService;
import com.entity.vo.YanyuanjianjieVO;
import com.entity.view.YanyuanjianjieView;

@Service("yanyuanjianjieService")
public class YanyuanjianjieServiceImpl extends ServiceImpl<YanyuanjianjieDao, YanyuanjianjieEntity> implements YanyuanjianjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanyuanjianjieEntity> page = this.selectPage(
                new Query<YanyuanjianjieEntity>(params).getPage(),
                new EntityWrapper<YanyuanjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanyuanjianjieEntity> wrapper) {
		  Page<YanyuanjianjieView> page =new Query<YanyuanjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YanyuanjianjieVO> selectListVO(Wrapper<YanyuanjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanyuanjianjieVO selectVO(Wrapper<YanyuanjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanyuanjianjieView> selectListView(Wrapper<YanyuanjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanyuanjianjieView selectView(Wrapper<YanyuanjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
