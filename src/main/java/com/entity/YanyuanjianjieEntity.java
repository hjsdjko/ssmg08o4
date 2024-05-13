package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 演员简介
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
@TableName("yanyuanjianjie")
public class YanyuanjianjieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YanyuanjianjieEntity() {
		
	}
	
	public YanyuanjianjieEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
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
