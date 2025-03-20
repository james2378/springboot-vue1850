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
 * 投票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 23:51:55
 */
@TableName("toupiaoxinxi")
public class ToupiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ToupiaoxinxiEntity() {
		
	}
	
	public ToupiaoxinxiEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date toupiaoriqi;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
