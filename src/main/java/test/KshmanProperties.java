package test;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component // Bean 생성
@ConfigurationProperties("kshman")
public class KshmanProperties {
	
	private String name;
	private int age;
	private String fullName;
	
	private Duration sessionTimeout = Duration.ofSeconds(30);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Duration getSessionTimeout() {
		return sessionTimeout;
	}
	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
	
}
