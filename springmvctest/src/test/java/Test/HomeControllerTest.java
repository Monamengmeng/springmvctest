package Test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.java.spring.controller.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * 使用static
 */
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


public class HomeControllerTest {
	
	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();		//搭建MockMvc
		mockMvc.perform(get("/")).andExpect(view().name("home"));	//对"/"执行GET请求，预期得到home视图
	}
	
}
