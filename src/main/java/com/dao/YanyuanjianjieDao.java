package com.dao;

import com.entity.YanyuanjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanyuanjianjieVO;
import com.entity.view.YanyuanjianjieView;


/**
 * 演员简介
 * 
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface YanyuanjianjieDao extends BaseMapper<YanyuanjianjieEntity> {
	
	List<YanyuanjianjieVO> selectListVO(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
	
	YanyuanjianjieVO selectVO(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
	
	List<YanyuanjianjieView> selectListView(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);

	List<YanyuanjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
	
	YanyuanjianjieView selectView(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
	
}
