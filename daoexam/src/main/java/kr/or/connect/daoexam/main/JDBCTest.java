package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {
		// 1) RoleDao 가져온다 
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
//		Role role = new Role();
//		role.setRoleId(201);
//		role.setDescription("PROGRAMMER");
		
//		int count = roleDao.insert(role);
//		System.out.println(count + "건 입력하였습니다.");
		
//		int count = roleDao.update(role);
//		System.out.println(count + "건 수정하였습니다.");
		
		Role role = roleDao.selectById(201); 
		System.out.println(role);
		int count = roleDao.deleteById(201);
		System.out.println(count);
		Role role2 = roleDao.selectById(201); 
		System.out.println(role2);
	}
}
