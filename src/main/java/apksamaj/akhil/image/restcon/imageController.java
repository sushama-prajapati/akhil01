package apksamaj.akhil.image.restcon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import apksamaj.akhil.dao.User;
import apksamaj.akhil.service.UserService;



@RestController
public class imageController {
	
	@Autowired
	public UserService userService;
	
//	@PostMapping("/saveImage")
//	public String saveImage(@RequestBody Image image) {
//		
//		return "Image added Successfully";
//	}
	
	@GetMapping("/getAllImage")
	public String getAllImage() {
		return "hello";
	}
	@GetMapping("/getUser")
	public List<User> getAllUSer(){
		System.out.println("hello get all user");
		return userService.getAllUsers();
		
	}
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		
		userService.saveUser(user);
		return "User added successsully";
	}

   

}
