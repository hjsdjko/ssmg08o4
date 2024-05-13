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
 * 票务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-21 17:45:05
 */
@TableName("piaowuxinxi")
public class PiaowuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PiaowuxinxiEntity() {
		
	}
	
	public PiaowuxinxiEntity(T t) {
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
	 * 票务名称
	 */
					
	private String piaowumingcheng;
	
	/**
	 * 票务图片
	 */
					
	private String piaowutupian;
	
	/**
	 * 演出城市
	 */
					
	private String yanchuchengshi;
	
	/**
	 * 演出地点
	 */
					
	private String yanchudidian;
	
	/**
	 * 演出时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yanchushijian;
	
	/**
	 * 结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jieshushijian;
	
	/**
	 * 演出名单
	 */
					
	private String yanchumingdan;
	
	/**
	 * 座位类型
	 */
					
	private String zuoweileixing;
	
	/**
	 * 票务备注
	 */
					
	private String piaowubeizhu;
	
	/**
	 * 宣传视频
	 */
					
	private String xuanchuanshipin;
	
	/**
	 * 演出详情
	 */
					
	private String yanchuxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	/**
	 * 座位总数
	 */
					
	private Integer number;
	
	/**
	 * 已选座位[用,号隔开]
	 */
					
	private String selected;
	
	
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
	 * 设置：票务名称
	 */
	public void setPiaowumingcheng(String piaowumingcheng) {
		this.piaowumingcheng = piaowumingcheng;
	}
	/**
	 * 获取：票务名称
	 */
	public String getPiaowumingcheng() {
		return piaowumingcheng;
	}
	/**
	 * 设置：票务图片
	 */
	public void setPiaowutupian(String piaowutupian) {
		this.piaowutupian = piaowutupian;
	}
	/**
	 * 获取：票务图片
	 */
	public String getPiaowutupian() {
		return piaowutupian;
	}
	/**
	 * 设置：演出城市
	 */
	public void setYanchuchengshi(String yanchuchengshi) {
		this.yanchuchengshi = yanchuchengshi;
	}
	/**
	 * 获取：演出城市
	 */
	public String getYanchuchengshi() {
		return yanchuchengshi;
	}
	/**
	 * 设置：演出地点
	 */
	public void setYanchudidian(String yanchudidian) {
		this.yanchudidian = yanchudidian;
	}
	/**
	 * 获取：演出地点
	 */
	public String getYanchudidian() {
		return yanchudidian;
	}
	/**
	 * 设置：演出时间
	 */
	public void setYanchushijian(Date yanchushijian) {
		this.yanchushijian = yanchushijian;
	}
	/**
	 * 获取：演出时间
	 */
	public Date getYanchushijian() {
		return yanchushijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：演出名单
	 */
	public void setYanchumingdan(String yanchumingdan) {
		this.yanchumingdan = yanchumingdan;
	}
	/**
	 * 获取：演出名单
	 */
	public String getYanchumingdan() {
		return yanchumingdan;
	}
	/**
	 * 设置：座位类型
	 */
	public void setZuoweileixing(String zuoweileixing) {
		this.zuoweileixing = zuoweileixing;
	}
	/**
	 * 获取：座位类型
	 */
	public String getZuoweileixing() {
		return zuoweileixing;
	}
	/**
	 * 设置：票务备注
	 */
	public void setPiaowubeizhu(String piaowubeizhu) {
		this.piaowubeizhu = piaowubeizhu;
	}
	/**
	 * 获取：票务备注
	 */
	public String getPiaowubeizhu() {
		return piaowubeizhu;
	}
	/**
	 * 设置：宣传视频
	 */
	public void setXuanchuanshipin(String xuanchuanshipin) {
		this.xuanchuanshipin = xuanchuanshipin;
	}
	/**
	 * 获取：宣传视频
	 */
	public String getXuanchuanshipin() {
		return xuanchuanshipin;
	}
	/**
	 * 设置：演出详情
	 */
	public void setYanchuxiangqing(String yanchuxiangqing) {
		this.yanchuxiangqing = yanchuxiangqing;
	}
	/**
	 * 获取：演出详情
	 */
	public String getYanchuxiangqing() {
		return yanchuxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：座位总数
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * 获取：座位总数
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * 设置：已选座位[用,号隔开]
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}
	/**
	 * 获取：已选座位[用,号隔开]
	 */
	public String getSelected() {
		return selected;
	}

}
