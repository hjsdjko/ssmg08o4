package com.dao;

import com.entity.DiscussyanyuanjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyanyuanjianjieVO;
import com.entity.view.DiscussyanyuanjianjieView;


/**
 * 演员简介评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface DiscussyanyuanjianjieDao extends BaseMapper<DiscussyanyuanjianjieEntity> {
	
	List<DiscussyanyuanjianjieVO> selectListVO(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
	
	DiscussyanyuanjianjieVO selectVO(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
	
	List<DiscussyanyuanjianjieView> selectListView(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);

	List<DiscussyanyuanjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
	
	DiscussyanyuanjianjieView selectView(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
	
}
