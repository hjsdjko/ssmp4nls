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
 * 民宿信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 16:55:50
 */
@TableName("minsuxinxi")
public class MinsuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MinsuxinxiEntity() {
		
	}
	
	public MinsuxinxiEntity(T t) {
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
	 * 民宿名称
	 */
					
	private String minsumingcheng;
	
	/**
	 * 民宿图片
	 */
					
	private String minsutupian;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 民宿星级
	 */
					
	private String minsuxingji;
	
	/**
	 * 一晚价格
	 */
					
	private Integer yiwanjiage;
	
	/**
	 * 民宿地址
	 */
					
	private String minsudizhi;
	
	/**
	 * 民宿介绍
	 */
					
	private String minsujieshao;
	
	/**
	 * 房主账号
	 */
					
	private String fangzhuzhanghao;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
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
	 * 设置：民宿名称
	 */
	public void setMinsumingcheng(String minsumingcheng) {
		this.minsumingcheng = minsumingcheng;
	}
	/**
	 * 获取：民宿名称
	 */
	public String getMinsumingcheng() {
		return minsumingcheng;
	}
	/**
	 * 设置：民宿图片
	 */
	public void setMinsutupian(String minsutupian) {
		this.minsutupian = minsutupian;
	}
	/**
	 * 获取：民宿图片
	 */
	public String getMinsutupian() {
		return minsutupian;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：民宿星级
	 */
	public void setMinsuxingji(String minsuxingji) {
		this.minsuxingji = minsuxingji;
	}
	/**
	 * 获取：民宿星级
	 */
	public String getMinsuxingji() {
		return minsuxingji;
	}
	/**
	 * 设置：一晚价格
	 */
	public void setYiwanjiage(Integer yiwanjiage) {
		this.yiwanjiage = yiwanjiage;
	}
	/**
	 * 获取：一晚价格
	 */
	public Integer getYiwanjiage() {
		return yiwanjiage;
	}
	/**
	 * 设置：民宿地址
	 */
	public void setMinsudizhi(String minsudizhi) {
		this.minsudizhi = minsudizhi;
	}
	/**
	 * 获取：民宿地址
	 */
	public String getMinsudizhi() {
		return minsudizhi;
	}
	/**
	 * 设置：民宿介绍
	 */
	public void setMinsujieshao(String minsujieshao) {
		this.minsujieshao = minsujieshao;
	}
	/**
	 * 获取：民宿介绍
	 */
	public String getMinsujieshao() {
		return minsujieshao;
	}
	/**
	 * 设置：房主账号
	 */
	public void setFangzhuzhanghao(String fangzhuzhanghao) {
		this.fangzhuzhanghao = fangzhuzhanghao;
	}
	/**
	 * 获取：房主账号
	 */
	public String getFangzhuzhanghao() {
		return fangzhuzhanghao;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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

}
