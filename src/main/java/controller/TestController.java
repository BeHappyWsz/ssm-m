package controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.User;
import service.UserService;

@Controller
public class TestController extends BaseTest{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("index")
	public ModelAndView index() {
		User user = userService.getById(28);
		System.out.println(user.toString());
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@Test
	public void getById() throws Exception {
		System.out.println("aa");
		System.out.println("aa");
		System.out.println("aa");
		System.out.println("aa");
		User user = userService.getById(28);
		if(user == null) {
			System.out.println("bb");
		}else {
			System.out.println(user.toString());
		}
		
	}
}
