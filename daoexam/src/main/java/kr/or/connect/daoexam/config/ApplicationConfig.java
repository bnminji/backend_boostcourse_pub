package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.connect.daoexam.dao"})
@Import({DBConfig.class}) //설정파일 여러개로 나눠서 사용할 수 있음
public class ApplicationConfig {

}
