package com.entity.model;

import com.entity.YanyuanjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 演员简介
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
public class YanyuanjianjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 相声角色
	 */
	
	private String xiangshengjiaose;
		
	/**
	 * 作品代表
	 */
	
	private String zuopindaibiao;
		
	/**
	 * 人物介绍
	 */
	
	private String renwujieshao;
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：相声角色
	 */
	 
	public void setXiangshengjiaose(String xiangshengjiaose) {
		this.xiangshengjiaose = xiangshengjiaose;
	}
	
	/**
	 * 获取：相声角色
	 */
	public String getXiangshengjiaose() {
		return xiangshengjiaose;
	}
				
	
	/**
	 * 设置：作品代表
	 */
	 
	public void setZuopindaibiao(String zuopindaibiao) {
		this.zuopindaibiao = zuopindaibiao;
	}
	
	/**
	 * 获取：作品代表
	 */
	public String getZuopindaibiao() {
		return zuopindaibiao;
	}
				
	
	/**
	 * 设置：人物介绍
	 */
	 
	public void setRenwujieshao(String renwujieshao) {
		this.renwujieshao = renwujieshao;
	}
	
	/**
	 * 获取：人物介绍
	 */
	public String getRenwujieshao() {
		return renwujieshao;
	}
			
}
