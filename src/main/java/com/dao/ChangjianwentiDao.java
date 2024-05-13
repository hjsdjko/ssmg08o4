package com.dao;

import com.entity.ChangjianwentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangjianwentiVO;
import com.entity.view.ChangjianwentiView;


/**
 * 常见问题
 * 
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface ChangjianwentiDao extends BaseMapper<ChangjianwentiEntity> {
	
	List<ChangjianwentiVO> selectListVO(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
	
	ChangjianwentiVO selectVO(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
	
	List<ChangjianwentiView> selectListView(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);

	List<ChangjianwentiView> selectListView(Pagination page,@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
	
	ChangjianwentiView selectView(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
	
}
