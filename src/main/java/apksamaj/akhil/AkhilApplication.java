package apksamaj.akhil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "apksamaj.akhil.repository")
public class AkhilApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkhilApplication.class, args);
	}

}
