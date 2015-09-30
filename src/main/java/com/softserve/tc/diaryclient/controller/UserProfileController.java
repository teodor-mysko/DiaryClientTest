package com.softserve.tc.diaryclient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.tc.diary.entity.User;
import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class UserProfileController {
	@RequestMapping(value = "/users")
	public String users(Model model) {
		 DiaryService port = DiaryServiceConnection.getDairyServicePort();

		List<User> usersList=port.getAllUsers();
		model.addAttribute("usersList", usersList);
//		List<Person> persons = service.getAll();
//		model.addAttribute("persons", persons);
		return "Users";
	}


		@RequestMapping(value = "/userProfile")
		public String userProfile(@RequestParam(value = "nickName") String nickName, Model model) {
			 DiaryService port = DiaryServiceConnection.getDairyServicePort();

			User us=port.getUserByNickName(nickName);
			model.addAttribute("user", us);
//			List<Person> persons = service.getAll();
//			model.addAttribute("persons", persons);
			return "user_profile";
		}
	
	

//	@RequestMapping(value = "/create")
//	public String create() {
//		return "newPerson";
//	}
//
//	@RequestMapping(value = "/showAll", method = RequestMethod.POST)
//	public String createPerson(@RequestParam(value = "name") String name,
//			@RequestParam(value = "age") String age) {
//		int ageInt = Integer.parseInt(age);
//		Person person = new Person(name, ageInt);
//		service.insert(person);
//		return "redirect:/showAll";
//	}
}
