package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangjianwentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangjianwentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangjianwentiView;


/**
 * 常见问题
 *
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public interface ChangjianwentiService extends IService<ChangjianwentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangjianwentiVO> selectListVO(Wrapper<ChangjianwentiEntity> wrapper);
   	
   	ChangjianwentiVO selectVO(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
   	
   	List<ChangjianwentiView> selectListView(Wrapper<ChangjianwentiEntity> wrapper);
   	
   	ChangjianwentiView selectView(@Param("ew") Wrapper<ChangjianwentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangjianwentiEntity> wrapper);
   	
}

