package com.zsc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsc.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	private static List<User> USERS = new ArrayList<>();
	static {
		USERS.add(new User("zsc1", "男"));
		USERS.add(new User("zsc2", "男"));
		USERS.add(new User("zsc3", "女"));
		USERS.add(new User("zsc4", "女"));
	}

	@RequestMapping("/list")
	public String getUserList(Map<String, Object> map) {
		map.put("users", USERS);
		return "main";
	}

	@RequestMapping("/update")
	public String updateUser(User us, Map<String, Object> map) {
		User u = null;
		for (User user : USERS) {
			if (user.getName().equals(us.getName())) {
				u = user;
			}
		}
		USERS.remove(u);
		USERS.add(us);
		map.put("users", USERS);
		return "main";
	}

	@RequestMapping("/delete")
	public String deleteUser(String name, Map<String, Object> map) {
		User u = null;
		for (User user : USERS) {
			if (user.getName().equals(name)) {
				u = user;
			}
		}
		USERS.remove(u);
		map.put("users", USERS);
		return "main";
	}
	@RequestMapping("/add")
	public String addUser(User user,Map<String, Object> map) {
		USERS.add(user);
		map.put("users", USERS);
		return "main";
	}
}
