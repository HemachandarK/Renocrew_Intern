package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
        Emp ss=(Emp)con.getBean("e1");
        System.out.println(ss.getName());
        System.out.println(ss.getPhno());

	}

}
