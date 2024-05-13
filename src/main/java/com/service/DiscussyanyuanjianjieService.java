package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyanyuanjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyanyuanjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyanyuanjianjieView;


/**
 * 演员简介评论表
 *
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface DiscussyanyuanjianjieService extends IService<DiscussyanyuanjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyanyuanjianjieVO> selectListVO(Wrapper<DiscussyanyuanjianjieEntity> wrapper);
   	
   	DiscussyanyuanjianjieVO selectVO(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
   	
   	List<DiscussyanyuanjianjieView> selectListView(Wrapper<DiscussyanyuanjianjieEntity> wrapper);
   	
   	DiscussyanyuanjianjieView selectView(@Param("ew") Wrapper<DiscussyanyuanjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyanyuanjianjieEntity> wrapper);
   	
}

