package com.webservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.webservice.model.User;
import com.webservice.model.Users;
@RestController
@RequestMapping("user")
public class UserController {
/*@GetMapping("")
public String hello()
{
return "hello spring";	
}
*/
@GetMapping
public List<User> getOneUser()
{
/*User u1=new User("salim","salem",33);
return u1.toString();
*/
	return Users.usersList;
	
}
/*@PostMapping
public String addFoo(@RequestParam(name = "id") String fooId,
@RequestParam String name) {
return "ID: " + fooId + " Name: " + name;
}
*/
@PostMapping
public String addUser(@RequestBody User user)
{
	Users.usersList.add(user);
return user.toString();	
}
@GetMapping("/search")
public String searchUser(@RequestParam(required = false) String id)

{
return "you are looking for "+id;	
}

}
