package com.tap.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.classes.President;
import com.tap.interfaces.Service;

public class Navy implements Service{

	ClassPathXmlApplicationContext ac;
	public Navy(ClassPathXmlApplicationContext ac) {
		this.ac=ac;
	}

	@Override
	public void addressPresident() {
		
		President p = (President) ac.getBean("president");
		System.out.println(p);
		
	}

}