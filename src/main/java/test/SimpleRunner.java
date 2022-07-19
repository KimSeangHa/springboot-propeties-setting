package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {
	
	@Autowired
	KshmanProperties kshmanProperties;
	
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=====================");
		System.out.println(kshmanProperties.getName());
		System.out.println(kshmanProperties.getAge());
		System.out.println(kshmanProperties.getSessionTimeout());
		System.out.println("=====================");
	}

}
