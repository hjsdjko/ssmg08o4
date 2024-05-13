package com.dao;

import com.entity.DiscusschangjianwentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschangjianwentiVO;
import com.entity.view.DiscusschangjianwentiView;


/**
 * 常见问题评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface DiscusschangjianwentiDao extends BaseMapper<DiscusschangjianwentiEntity> {
	
	List<DiscusschangjianwentiVO> selectListVO(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
	
	DiscusschangjianwentiVO selectVO(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
	
	List<DiscusschangjianwentiView> selectListView(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);

	List<DiscusschangjianwentiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
	
	DiscusschangjianwentiView selectView(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
	
}
