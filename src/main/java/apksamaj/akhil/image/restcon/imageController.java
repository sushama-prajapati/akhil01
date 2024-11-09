package apksamaj.akhil.image.restcon;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imageController {
	
	
	@GetMapping(value="/getAllImage")
	public String getAllImage() {
		return "hello";
	}

}
