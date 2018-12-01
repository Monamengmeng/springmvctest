package com.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.dao.SpittleRepository;

/**
 * 在模型中放入最新的spittle列表
 * 
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittleRepository spittleRepository;
	
	@Autowired	/*	自动setter/getter方法，无需再setter/getter	*/
	public SpittleController(SpittleRepository spittleRepository){ 		//注入SpittleRepository
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model) {
		
		/**
		 * Model实际上就是一个Map，他会传递给视图这样数据,就能渲染到客户端了
		 * 
		 * Model可以替换Map
		 */
		
		model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
		
		
		
		/*model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE, 20));//将spittle添加到模型中
		return "spittles";		//返回视图名
			//此视图渲染模型
*/	}
}
