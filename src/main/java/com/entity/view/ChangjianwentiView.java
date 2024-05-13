package com.entity.view;

import com.entity.ChangjianwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 常见问题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
@TableName("changjianwenti")
public class ChangjianwentiView  extends ChangjianwentiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChangjianwentiView(){
	}
 
 	public ChangjianwentiView(ChangjianwentiEntity changjianwentiEntity){
 	try {
			BeanUtils.copyProperties(this, changjianwentiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
