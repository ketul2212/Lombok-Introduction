
package com.ketul.resourse;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.module.User;

@RestController
public class UserResource {

	@PostMapping("/")
	public User getUser(@RequestBody @NotNull User user1) {
		User user = new User();
		user.setName(user1.getName());
		user.setPass(user1.getPass());
		System.out.println(user);
		return user;
	}
}