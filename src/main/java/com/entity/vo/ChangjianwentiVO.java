package com.entity.vo;

import com.entity.ChangjianwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 常见问题
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public class ChangjianwentiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问题类型
	 */
	
	private String wentileixing;
		
	/**
	 * 问题图片
	 */
	
	private String wentitupian;
		
	/**
	 * 问题内容
	 */
	
	private String wentineirong;
		
	/**
	 * 解决方法
	 */
	
	private String jiejuefangfa;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：问题类型
	 */
	 
	public void setWentileixing(String wentileixing) {
		this.wentileixing = wentileixing;
	}
	
	/**
	 * 获取：问题类型
	 */
	public String getWentileixing() {
		return wentileixing;
	}
				
	
	/**
	 * 设置：问题图片
	 */
	 
	public void setWentitupian(String wentitupian) {
		this.wentitupian = wentitupian;
	}
	
	/**
	 * 获取：问题图片
	 */
	public String getWentitupian() {
		return wentitupian;
	}
				
	
	/**
	 * 设置：问题内容
	 */
	 
	public void setWentineirong(String wentineirong) {
		this.wentineirong = wentineirong;
	}
	
	/**
	 * 获取：问题内容
	 */
	public String getWentineirong() {
		return wentineirong;
	}
				
	
	/**
	 * 设置：解决方法
	 */
	 
	public void setJiejuefangfa(String jiejuefangfa) {
		this.jiejuefangfa = jiejuefangfa;
	}
	
	/**
	 * 获取：解决方法
	 */
	public String getJiejuefangfa() {
		return jiejuefangfa;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
