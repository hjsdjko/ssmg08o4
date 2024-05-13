package com.entity.view;

import com.entity.DiscussyanyuanjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 演员简介评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
@TableName("discussyanyuanjianjie")
public class DiscussyanyuanjianjieView  extends DiscussyanyuanjianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyanyuanjianjieView(){
	}
 
 	public DiscussyanyuanjianjieView(DiscussyanyuanjianjieEntity discussyanyuanjianjieEntity){
 	try {
			BeanUtils.copyProperties(this, discussyanyuanjianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
