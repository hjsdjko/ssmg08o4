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
 * 常见问题
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
@TableName("changjianwenti")
public class ChangjianwentiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChangjianwentiEntity() {
		
	}
	
	public ChangjianwentiEntity(T t) {
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
	 * 问题名称
	 */
					
	private String wentimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：问题名称
	 */
	public void setWentimingcheng(String wentimingcheng) {
		this.wentimingcheng = wentimingcheng;
	}
	/**
	 * 获取：问题名称
	 */
	public String getWentimingcheng() {
		return wentimingcheng;
	}
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
