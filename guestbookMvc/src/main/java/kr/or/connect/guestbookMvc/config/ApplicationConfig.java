package kr.or.connect.guestbookMvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.guestbookMvc.dao",  "kr.or.connect.guestbookMvc.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {
	
}
