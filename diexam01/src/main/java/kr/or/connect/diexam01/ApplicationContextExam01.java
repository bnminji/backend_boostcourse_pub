package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("초기화 완료");
		
		Userbean userBean = (Userbean)ac.getBean("userbean");//xml에 많은 객체 등록할 수 있으며, 그렇기 때문에 getBean은 object type을 return한다
		userBean.setName("kang");
		
		System.out.println(userBean.getName());
		
		Userbean userBean2 = (Userbean)ac.getBean("userbean");
		System.out.println(userBean.getName());
//		if(userBean == userBean2) System.out.println("같은 인스턴스");
	}

}
