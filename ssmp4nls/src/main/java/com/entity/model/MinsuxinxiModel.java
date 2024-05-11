package com.entity.model;

import com.entity.MinsuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 民宿信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 16:55:50
 */
public class MinsuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
