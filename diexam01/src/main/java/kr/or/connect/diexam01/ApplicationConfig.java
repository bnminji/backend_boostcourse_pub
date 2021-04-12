package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//config 파일임을 알려주는 어노테이션
//어노테이션 컴파일, 런타임시에 
//conf~ 설정 
//싱글턴으로 관리
@Configuration
public class ApplicationConfig {
	@Bean
	public Car car(Engine e) {
		Car c = new Car();
		c.setEngine(e);
		return c;
	}
	@Bean
	public Engine engine(){
		return new Engine();
	}
	
}
