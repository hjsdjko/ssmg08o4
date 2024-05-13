package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschangjianwentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschangjianwentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschangjianwentiView;


/**
 * 常见问题评论表
 *
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface DiscusschangjianwentiService extends IService<DiscusschangjianwentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschangjianwentiVO> selectListVO(Wrapper<DiscusschangjianwentiEntity> wrapper);
   	
   	DiscusschangjianwentiVO selectVO(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
   	
   	List<DiscusschangjianwentiView> selectListView(Wrapper<DiscusschangjianwentiEntity> wrapper);
   	
   	DiscusschangjianwentiView selectView(@Param("ew") Wrapper<DiscusschangjianwentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschangjianwentiEntity> wrapper);
   	
}

