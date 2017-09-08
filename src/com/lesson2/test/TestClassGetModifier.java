package com.lesson2.test;

import java.lang.reflect.Modifier;

import com.lesson2.bean.TestModifier;

/**
 * 获取类的修饰符
 * 
 * @author gsm02
 *
 */
public class TestClassGetModifier {

	public static void main(String[] args) {
		System.out.println("modifiers value:" + TestModifier.class.getModifiers());
		System.out.println("modifiers :" + Modifier.toString(TestModifier.class.getModifiers()));
	}

}
