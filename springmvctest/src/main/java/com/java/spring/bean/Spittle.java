package com.java.spring.bean;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 类中包含消息内容、时间戳、位置信息
 * 
 * @author Administrator
 *
 */

public class Spittle {
	
	private final Long id;
	private final String message;
	private final Date time;
	private Double longitude;
	private Double lastitude;
	
	public Spittle(String message,Date time) {			//构造方法之间的相互调用
		this(message,time,null,null);
	}
	
	public Spittle(String message,Date time,Double longitude ,Double lastitude) {
		this.id=null;
		this.message=message;
		this.time=time;
		this.longitude=longitude;
		this.lastitude=lastitude;
	}
	
	public long getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Date getTime() {
		return time;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	
	public Double getLastitude() {
		return lastitude;
	}
	
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
}

