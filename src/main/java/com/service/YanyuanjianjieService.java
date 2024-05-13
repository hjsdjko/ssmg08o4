package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanyuanjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanyuanjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanyuanjianjieView;


/**
 * 演员简介
 *
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface YanyuanjianjieService extends IService<YanyuanjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanyuanjianjieVO> selectListVO(Wrapper<YanyuanjianjieEntity> wrapper);
   	
   	YanyuanjianjieVO selectVO(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
   	
   	List<YanyuanjianjieView> selectListView(Wrapper<YanyuanjianjieEntity> wrapper);
   	
   	YanyuanjianjieView selectView(@Param("ew") Wrapper<YanyuanjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanyuanjianjieEntity> wrapper);
   	
}

