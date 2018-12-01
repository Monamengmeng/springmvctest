package com.java.spring.dao;

import java.util.List;

import com.java.spring.bean.Spittle;

/**
 * 为了获取Spittle列表
 * 
 * @author Administrator
 *
 */
public interface SpittleRepository {
	List<Spittle> findSpittles(long max,int count);
}
