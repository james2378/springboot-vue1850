package com.entity.vo;

import com.entity.ToupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 投票信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 23:51:55
 */
public class ToupiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章类型
	 */
	
	private String wenzhangleixing;
		
	/**
	 * 票数
	 */
	
	private Integer piaoshu;
		
	/**
	 * 投票日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date toupiaoriqi;
				
	
	/**
	 * 设置：文章类型
	 */
	 
	public void setWenzhangleixing(String wenzhangleixing) {
		this.wenzhangleixing = wenzhangleixing;
	}
	
	/**
	 * 获取：文章类型
	 */
	public String getWenzhangleixing() {
		return wenzhangleixing;
	}
				
	
	/**
	 * 设置：票数
	 */
	 
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
				
	
	/**
	 * 设置：投票日期
	 */
	 
	public void setToupiaoriqi(Date toupiaoriqi) {
		this.toupiaoriqi = toupiaoriqi;
	}
	
	/**
	 * 获取：投票日期
	 */
	public Date getToupiaoriqi() {
		return toupiaoriqi;
	}
			
}
